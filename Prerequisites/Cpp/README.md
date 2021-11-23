# C++ and All

As for me, I consider C++ is exactly an elegant language, and it is exactly indispensable to understand its Design Pattern and underlying Structure. Thus i would do these so-called dirty jobs in this Repo.

# VSCODE Debugger

[Tutorial](https://zhuanlan.zhihu.com/p/361974163)


# Design Pattern

## Object-Oriented Programming

Recall some details in [MIT 6.S096](https://github.com/PeterWrighten/Excellent_OCW/blob/main/MIT_6.S096/README.md), we have learned some features of C++ about OOP. However, these are totally insufficient. In there, we would talk more details about OOP and its underlying logistics.

### Design Principle

1. DIP(Dependency Inversion Principle)

Denote ```->``` means "Depend on".

- High Module -/-> Low Module; High & Low -> Interface.
- Interface -/-> Implementation; 


>i.e.: Use subclass in Interface.

2. OCP(Open Close Principle)

- Close for Modification, Open for expansion.

3. SRP(Single Reponsibility Principle)

- One class only have one Responsibility.

4. LSP(Liskov Principle)

- Subclass could substitute their baseclass.

5. ISP(Interface Seperation Principle)

- Could not push client to apply useless interface
- clever interface

6. Never Abuse Inheritance
7. Encapsulation changepoint

- Seperation between objects

8. Interface-oriented Programming, Not Implementation-oriented Programming

**Interface Standardization**

- Coupling design