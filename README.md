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

### `todo`: Self-hosted todo script

The underscore-prefixed `_todo`, is the prototype of `todo`, which is gitignored
by default, and specifically for private use, because all the todo items will be
created **at the end of** the script, and therefore I call this script
*self-hosted* (is it a misconception?).

**Warning:** Don't maunally modify the script itself. Create issues for filing
bugs, new features, help wanted, etc.

#### Usage

Run the command before using `todo`:

```bash
$ cp _todo todo
```

And now you can call for help by `todo -h` or `todo --help`. Here's the output:

```
todo: Self-hosted todo script

Usage:
  todo
  todo [-h|--help]
  todo COMMAND

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

### `gh-add`: A simple commond generator to add a Github remote repository

Run `_gh-add` with `scheme` (`https` or `ssh`) and `username` to generate a very
simple shell script, with some commands for you to add a GitHub remote repo.

For instance,

```bash
$ _gh-add ssh anqurvanillapy
```

Now the configuration is done! The command `gh-add` is ready to serve! So the
next step is to add some remote repos...

```
$ gh-add hello-world
# This is equivalent to
#   $ git remote add git@github.com:anqurvanillapy/hello-world.git
```

Have fun with this little hack!

License
-------

ISC
