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

License
-------

ISC
