# Prerequisites

With the study of Computer Science, I gradually realise that it is indispensable to take some prerequisites when you wanna begin to learn/research a specific field. Thus I set up this corner to focus on do these dirty jobs.

# Note

## Part 1: Git - Distributed version control system

* Aim

**Sync and control variable versions of Doc or Proj**

* History

1991- Linus rolls out linux

-> Linus and Volunteers upgrade Linux by just [diff](https://en.wikipedia.org/wiki/Diff). (Why not CVS or SVN? Because it is centeralized but distributed.)

-> 2002- Bitkeeper authorizes Linus/Linux to use Bitkeeper for version control by free.

-> 2005- Hackers from Linux Community try to crack Bitkeeper's Protocol. Bitkeeper found it and unauthorized Bitkeeper for Linux.

-> Linus himself code a new version control system (totally open-source and free) by C, which is named Git.

-> 2008- GitHub established, Git became more and more popular.

**Difference Between Centeralized and Distributed**

* Centeralized

>Demerit:
1. Must Online
2. Inefficient(Traffic load jam)
3. Unsecure

Peer --Request--> Library Server

Peer <--Send-- Library Server

* Distributed

>Merit:
1. Every Computer is Server
2. Available even offline
3. P2P

>Demerit

Unsync <-- Deploy a Management Server to fix

Peer1 <--ManageServer--> Peer2

* Git

```$ git config --global user.name ""```

```$ git config --global user.email ""```

>git could only track change from text file(binary code file coud not be tracked)

```
$ git init xxx
$ git add xxx <-- add from working directory to Temp District(stage)
$ git commit -m "xxx" <-- commit to repo
$ git status
$ git diff
$ git log --pretty=oneline
```

* Windows Trap

When you use Windows's txt to open a text file, it would add a "0xefdd" at head of file automatically...

* Commit ID

Git's commit ID is a very large hexadecimal which is calculated by SHA1.

HEAD(Top pointer)
HEAD^
HEAD~100
```
$ git reset HEAD^
$ git reset HEAD^^
$ git reset HEAD~100
$ git log
$ git reflog
```

* Core

Manage "change", not "file".

```
$ git checkout --<file> <-- recover to previous "git add"

== git reset HEAD <file>

$ git checkout -<branch> <-- change branch
```
* Remote Repository

* Cryptography

>ssh-keygen is a standard component of the Secure Shell (SSH) protocol suite found on Unix, Unix-like and Microsoft Windows computer systems used to establish secure shell sessions between remote computers over insecure networks, through the use of various cryptographic techniques. The ssh-keygen utility is used to generate, manage, and convert authentication keys.

```
$ ssh-keygen -t rsa -C "youemail@.com"
```

>wait to update

## Part2: Linux editor - Vim

Vim has 3 modes under linux:

- Normal mode `esc`
- Insert mode `i`
- visualized mode `v`
- Command mode `:`

Common Command:

- `:w`: Just Save changes, but exit
- `:w!`: Just Forcely save changes, but exit 
- `:q!`: Exit, but save changes
- `:wq`: Exit and save
- `:x`: Same with `:wq`
- `:saveas file`: save as file
- `:e file`: open file
