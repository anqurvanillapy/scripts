scripts
=======

Life in the fast *line*.

> Time is running out. Make a move.

Trivia
------

### Shadowsocks Daily Hacks

- Scripts I use to manipulate SS configs in this repo are
    + `sciconn`
    + `sciconn-wifi`

#### `sciconn`?

It is just a wrapper (or set of aliases) for conveniently toggling `gsettings`,
which will override the `$socks_proxy` variable.

#### `sciconn-wifi`?

An SS mobile app is not good enough for my iPhone, so here it is a better hack
that provides a global yet stable HTTP proxy. Use [privoxy](https://www.privoxy.org/).

Forward the SS local server to laptop's Wi-Fi hotspot, and listen to the Wi-Fi
gateway address and an unused port. Connect to the Wi-Fi with HTTP proxy on the
cellphone and it would work. So `sciconn-wifi` is more like an alias, but I put
it in this repo for having this in mind.

**Cons:** Some hosts will prohibit the usage of privoxy.

### Some self-hosted scripts

Some underscore-prefixed scripts, e.g. `_t0d0` and `_turf`, are the prototype of
the self-hosted code, which are gitignore-d by default, and specifically for
private use, because all the data will be created **at the end of** the script,
and therefore I call these scripts *self-hosted* (is it a misconception?).

**Warning:** Don't maunally modify the scripts itself. Create issues for filing
bugs, new features, help wanted, etc.

#### Example usage of `t0d0`

Run the command before using `t0d0`:

```bash
$ cp _t0d0 t0d0
```

And now you can call for help by `t0d0 -h` or `t0d0 --help`. Here's the output:

```
t0d0: Self-hosted todo script

Usage:
  t0d0
  t0d0 [-h|--help]
  t0d0 COMMAND

Commands:
  add         Add a new todo item
  done        Mark an item completed
  undo        Oops, something's not done yet
  kill        Delete an item
  clean       Kill the todo list

Warning: Using alphabetic characters, numerical digits and common
punctuation marks in the todo items is safer. Signs like '#', '['
added to new todo items may cause some printing flaws, or even fatal
errors.
```

### Some simple commond generators for Github repository hacks

#### `gh-add`

Run `_gh-add` with `scheme` (`https` or `ssh`) and `username` to generate a very
simple shell script, with some commands for you to add a GitHub remote repo.

For instance,

```bash
$ _gh-add ssh anqurvanillapy
```

Now the configuration is done! The command `gh-add` is ready to serve! So the
next step is to add some remote repos...

```bash
$ cd foo/
$ gh-add
# This is equivalent to
#   $ cd foo/ && git remote add origin git@github.com:anqurvanillapy/foo.git
```

#### `gh-clone`

This script is pretty similar to the previous one, for conveniently cloning a
remote repository.

```bash
$ _gh-clone ssh # configure that it would clone a repo via SSH
$ gh-clone username repo    # now it is available
```

Have fun with these little hacks!

License
-------

ISC
