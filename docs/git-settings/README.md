# Git 配置

## Git 客户端配置

Git 客户端的配置文件位于用户根目录下，包括 `.gitconfig`（Git 环境配置） 和 `.minttyrc`（Git 客户端 mintty 配置）两个文件。

`~/.gitconfig` 的配置命令如下：

```bash
git config --global user.name liym@com         公司
git config --global user.name liym@home        家里
git config --global user.email ijliym@163.com

git config --global core.autocrlf input
git config --global core.safecrlf warn
git config --global core.whitespace cr-at-eol
git config --global core.longpaths true
git config --global core.quotepath false
git config --global core.ignorecase false

git config --global i18n.commitencoding utf-8
git config --global push.default simple
git config --global svn.pathnameencoding utf-8
git config --global log.date iso-local
git config --global gui.encoding utf-8
```

其中，`user.name` 是 Git 提交人名称（Committer），`user.email` 是注册 Git 账号时使用的Email地址，请填写正确，否则Git提交日志中会出现重复的提交人。

更多帮助，请参考：

 - https://git-scm.com/book/zh/v2

## Git SSH 密钥配置

```
ssh/config 是 SSH 密钥配置文件，路径为 ~/.ssh/config。
```

### 生成密钥

```bash
ssh-keygen -t rsa -b 4096 -C "liym@git-key" -f ~/.ssh/id_rsa
```

### 将密钥添加到ssh-agent的高速缓存中

```bash
ssh-agent bash --login -i
ssh-add ~/.ssh/id_rsa

ssh-add -l
ssh-add -D
```

### 将 ~/.ssh/id_rsa.pub 的内容添加到 `Git 服务器`
 - https://help.github.com/articles/adding-a-new-ssh-key-to-your-github-account/
 - https://gitee.com/help/articles/4181

### 测试

```bash
ssh -T git@github.com
ssh -T git@gitee.com
ssh -T git@git.oschina.net
```

---

更多帮助，请参考：

 - https://gitee.com/help/categories/38
 - https://my.oschina.net/stefanzhlg/blog/529403
 - http://blog.csdn.net/windzhu0514/article/details/54140084

---

解决 MSYS2 下的中文乱码问题：http://kc123kc.github.io/2015/12/24/How-To-Solve-Gibberish-Problem-Under-MSYS2/

