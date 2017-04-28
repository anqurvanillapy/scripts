#!/usr/bin/env bash

################################################################################
#
# gi
# ==
#
# A simple command to download a specific .gitignore file contained in a Bash
# script instead of a function in .bashrc file, for compatibility of different
# shells (e.g. fish).
#
# @author AnqurVanillapy
# @date 28 April 2017
# @version 0.1.0
################################################################################

curl -L -s https://www.gitignore.io/api/$@
