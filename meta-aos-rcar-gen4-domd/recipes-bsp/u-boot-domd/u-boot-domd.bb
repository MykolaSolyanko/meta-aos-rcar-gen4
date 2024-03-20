require u-boot-domd.inc

HOMEPAGE = "http://www.denx.de/wiki/U-Boot/WebHome"
DESCRIPTION = "This is version of the U-Boot customized/hacked for the boot of the DomD under Zephyr OS"

LICENSE = "GPLv2+"
LIC_FILES_CHKSUM = "file://Licenses/README;md5=2ca5f2c35c8cc335f0a19756634782f1"
PE = "1"

S = "${WORKDIR}/git"
B = "${WORKDIR}/build"
do_configure[cleandirs] = "${B}"

DEPENDS:append = " flex-native bison-native lzop-native srecord-native"

UBOOT_URL = "git://github.com/MykolaSolyanko/u-boot.git"
BRANCH = "test_remove_bootargs"

SRC_URI = "${UBOOT_URL};branch=${BRANCH};protocol=https"
SRCREV = "931ed2ce6f3c892d0cc54da8157a96b8c112c896"
PV = "v2020.10+git${SRCPV}"

UBOOT_CONFIG = "rcar4_xen_defconfig"
UBOOT_CONFIG[rcar4_xen_defconfig] = "rcar4_xen_defconfig"

UBOOT_MACHINE = ""
