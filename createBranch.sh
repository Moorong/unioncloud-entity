#!/bin/sh

# 执行脚本前先在服务器上设置git
# git config --global user.email "jenkins@vcread.com"
# git config --global user.name "jenkins"
# git config --global credential.helper store
# 第一次执行脚本需要输入用户名密码 

NV=$1

# 先拉取更新
git fetch

# 打本地分支
git checkout -b $NV

# 修改pom文件并提交
mvn versions:set -DnewVersion=$NV
git add .
git commit -m 'createbranch'

# push到远程
git push --set-upstream origin $NV

