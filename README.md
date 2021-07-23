# meta-luarocks: handle bitbake LUA recipes with luarocks

This layer adds many lua recipes that use the luarocks
application to build and install the files.

It also helps adding new recipes with the `bin/autogen_bb.lua` script.

## Easy addition of new LUA package bitbake recipes

 - Enter the `meta-luarocks` directory
 - Call `bin/autogen_bb.lua <lua-package-name>`
   - autogen downloads the rockspec file
   - it extracts values for the bitbake recipe
   - downloads the source archive to gather more data (LICENSE, src-dir)
   - creates a new recipe, prefixed by `lua-` if the package name does not
     already start with `lua`
   - repeats it for all dependencies declared in the rockspec
 - Open the new `package-name.bb` and adapt as needed.
 - Build it with bitbake

This is just a helper script for an easy start, it is not perfect.

## Details about the `luarocks.bbclass`

 - `do_configure()` creates a `luarocks.config` file in the
   WORKDIR.
 - `do_compile()` calls `luarocks` from the RECIPE\_SYSROOT\_NATIVE
   directory with the `luarocks.config`. Dependencies are ignored by luarocks
   and handled by bitbake dependencies.
   It finally installs the sources in `WORKDIR/rockinst/usr`, because it has no
   separate install step
 - `do_install()` copies all artefacts to ${D}

The luarocks package management files from `/usr/lib/luarocks` are put
into the `-dev` package.

### Compiler variables and settings

Variables that can be added in the recipe to control the compiling behavior:
 - `LUAROCKS_EXTRA_CC` will be appended to the CC variable in the settings.
 - `LUAROCKS_EXTRA_LD` will be appended to the LD command, which is by default
   `${CC} ${LDFLAGS}`

 - `LUAROCKS_EXTRA_CFLAGS` will be appended to the CFLAGS variable.

### Native lua packages

All packages get the `BBCLASSEXTEND = "native"` to be buildable
for the host. This comes in handy if you want to call LUA scripts
at build-time like for example `busted`

