
require recipes-kernel/linux/linux-yocto.inc

KBRANCH = "base"
SRCREV_machine ?= "22a3e397584619839ec645c7378dc40bdd5ad2d1"
SRCREV_meta ?= "299f12a06ca1d6fd90b24450dae3b9f257a536be"

SRC_URI = "git://github.com/01org/linux-intel-4.9.git;protocol=https;name=machine;branch=${KBRANCH}; \
           git://git.yoctoproject.org/yocto-kernel-cache;type=kmeta;name=meta;branch=yocto-4.9;destsuffix=${KMETA}"

LINUX_VERSION ?= "4.9.30"
LINUX_VERSION_EXTENSION = "-intel-pk-${LINUX_KERNEL_TYPE}"

PV = "${LINUX_VERSION}+git${SRCPV}"

KMETA = "kernel-meta"
KCONF_BSP_AUDIT_LEVEL = "2"

KERNEL_FEATURES_INTEL_COMMON ?= ""

COMPATIBLE_MACHINE_core2-32-intel-common = "${MACHINE}"
KMACHINE_core2-32-intel-common = "intel-core2-32"
KERNEL_FEATURES_append_core2-32-intel-common = "${KERNEL_FEATURES_INTEL_COMMON}"

COMPATIBLE_MACHINE_corei7-64-intel-common = "${MACHINE}"
KMACHINE_corei7-64-intel-common = "intel-corei7-64"
KERNEL_FEATURES_append_corei7-64-intel-common = "${KERNEL_FEATURES_INTEL_COMMON}"

COMPATIBLE_MACHINE_i586-nlp-32-intel-common = "${MACHINE}"
KMACHINE_i586-nlp-32-intel-common = "intel-quark"
KERNEL_FEATURES_append_i586-nlp-32-intel-common = ""

# For Crystalforest and Romley
KERNEL_MODULE_AUTOLOAD_append_core2-32-intel-common = " uio"
KERNEL_MODULE_AUTOLOAD_append_corei7-64-intel-common = " uio"

# For FRI2, NUC
KERNEL_MODULE_AUTOLOAD_append_core2-32-intel-common = " iwlwifi"
KERNEL_MODULE_AUTOLOAD_append_corei7-64-intel-common = " iwlwifi"

# Functionality flags
KERNEL_EXTRA_FEATURES ?= "features/netfilter/netfilter.scc"
KERNEL_FEATURES_append = " ${KERNEL_EXTRA_FEATURES}"
KERNEL_FEATURES_append = " ${@bb.utils.contains("TUNE_FEATURES", "mx32", " cfg/x32.scc", "" ,d)}"
