FILESEXTRAPATHS_prepend := "${THISDIR}/${PN}:"

PACKAGE_ARCH_crystalforest-gladden = "${MACHINE_ARCH}"
PACKAGE_ARCH_crystalforest-server = "${MACHINE_ARCH}"

COMPATIBLE_MACHINE_crystalforest-gladden = "crystalforest-gladden"
KMACHINE_crystalforest-gladden  = "crystalforest"
KBRANCH_crystalforest-gladden  = "standard/common-pc-64/crystalforest"

SRCREV_machine_pn-linux-yocto_crystalforest-gladden ?= "c03195ed6e3066494e3fb4be69154a57066e845b"
SRCREV_meta_pn-linux-yocto_crystalforest-gladden ?= "f1c9080cd27f99700fa59b5375d1ddd0afe625ad"

COMPATIBLE_MACHINE_crystalforest-server = "crystalforest-server"
KMACHINE_crystalforest-server  = "crystalforest"
KBRANCH_crystalforest-server  = "standard/common-pc-64/crystalforest"

SRCREV_machine_pn-linux-yocto_crystalforest-server ?= "a9ec82e355130160f9094e670bd5be0022a84194"
SRCREV_meta_pn-linux-yocto_crystalforest-server ?= "d9cd83c0292bd4e2a6754a96761027252e726a42"

LINUX_VERSION = "3.10.19"

module_autoload_uio = "uio"