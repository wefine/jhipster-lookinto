# Yarn 
Yarn是基于npm的新一代的包依赖管理器。官网地址为：https://yarnpkg.com/en/。

## 安装方式
```bash
brew install yarn
or
npm install --global yarn
```
更多安装方式请参见： https://yarnpkg.com/en/docs/install#windows-tab

## 添加环境变量
linux:
>> export PATH="$PATH:`yarn global bin`"

windows:
>> set PATH=%PATH%;C:\.yarn\bin

检查安装：
```bash
yarn --version
```