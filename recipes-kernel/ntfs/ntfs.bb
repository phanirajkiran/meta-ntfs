SUMMARY = "Native NTFS module"
LICENSE = "GPLv2"
LIC_FILES_CHKSUM = "file://.gitignore;md5=119b3b5a14b2dfa0844208bb19896425"

FILESEXTRAPATHS_prepend := "${THISDIR}/${PN}-${PV}:"

inherit module

SRCREV = "67557dfb00420f1c711e800c366bbbf0e8d7cb65"
SRC_URI = "git://github.com/gzg1984/NTFS-defused.git"
#
#file://0001-used-in-yocto.patch  \
#"


S = "${WORKDIR}/git"

# The inherit of module.bbclass will automatically name module packages with
# "kernel-module-" prefix as required by the oe-core build environment.

#
# This file was derived from the 'Hello World!' example recipe in the
# Yocto Project Development Manual.
#
###############
#DESCRIPTION = "Simple helloworld application"
#SECTION = "examples"
#DEPENDS = ""
#LICENSE = "MIT"
#LIC_FILES_CHKSUM = "file://LICENSE;md5=96af5705d6f64a88e035781ef00e98a8"
#
#
#SRC_URI = "git://github.com/DynamicDevices/bbexample.git"
#
#S = "${WORKDIR}/git"
#
#inherit autotools
#
## The autotools configuration I am basing this on seems to have a problem with a race condition when parallel make is enabled
#PARALLEL_MAKE = ""
