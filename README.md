# First Step

http://www.yoctoproject.org/docs/2.3.1/yocto-project-qs/yocto-project-qs.html




# meta-ntfs

如何使用这个meta
首先，你需要一个正常工作，可以编译的poky发布版
然后，进入poky目录，在meta平级的地方创建meta-ntfs,然后在其中做如下操作：
Means ,


---
#### mkdir meta-ntfs
#### cd meta-ntfs 
#### git init 
#### git remote add origin https://github.com/gzg1984/meta-ntfs.git 
#### git remote add origingit@github.com:phanirajkiran/meta-ntfs.git
#### git pull origin master
#### cd ..

#### git clone git://git.yoctoproject.org/poky
#### cd poky/
#### git clone git://git.openembedded.org/meta-openembedded 
#### source oe-init-build-env 
#### bitbake-layers add-layer ../meta-openembedded/meta-oe

Adjust sequnce as per the requirement. 
---
然后..

#### . oe-init-build-env
#### bitbake-layers add-layer ~/poky/meta-ntfs/
---

再然后
修改
#### vim conf/local.conf
其中末尾加上（用=符号覆盖前面的设置） 

##### MACHINE = "qemux86-64"
##### INHERIT += "rm_work"
##### DISTRO = "ntfs-os"

---
=检查设置
#### bitbake -s core-image-minimal|grep linux
需要看到
#### maxpain@ubuntu:~/poky/build$ bitbake -s core-image-minimal|grep linux-yocto
#### linux-yocto  XXXXXXX(existing kernel version) :  4.13-rc1+gitAUTOINC+ad2e885015_e10d104af5-r0( latest Kernel version for replacement)                           

---
最后重编我想要的系统：
#### nohup bitbake core-image-minimal & // No need to perform
（可能会导致消耗大量空间）



