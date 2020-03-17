package com.example.programmingkeypoints;

import java.util.ArrayList;
import java.util.List;

public class KeyPoints {

    private static List<KeyCourse> courses;
    private static KeyCourse keyCourse;

    public static List<KeyCourse> getCourses() {
        if (courses == null) {
            courses = new ArrayList<KeyCourse>();

            // QBasic
            keyCourse = new KeyCourse();
            keyCourse.setId(1);
            keyCourse.setTitle("QBasic");
            keyCourse.setLevel("nd1");
            keyCourse.setSemester("first");
            keyCourse.setSubHead("Introduction");
            keyCourse.setBody("You've probably used computers to play games, and to write reports for school. It's a lot\n" +
                    "more fun to create your own games to play on the computer. This book will help you get\n" +
                    "started by using QBASIC.\n" +
                    "QBASIC is a programming language. With a programming language you can tell the\n" +
                    "computer what you want it to do. It's a lot like giving someone directions to your house.\n" +
                    "The computer follows each step and does exactly what you tell it. By programming the\n" +
                    "computer you can solve math problems, create art or music, and even make new games.\n" +
                    "It's all up to you.\n" +
                    "The best way to start with this tutorial is to type in some of the small programs you'll find\n" +
                    "in each of the chapters. Then change the programs to do what you want them to do.\n" +
                    "Before long, you'll be writing your own programs.");
            courses.add(keyCourse);


            keyCourse = new KeyCourse();
            keyCourse.setId(2);
            keyCourse.setTitle("QBasic");
            keyCourse.setLevel("nd1");
            keyCourse.setSemester("first");
            keyCourse.setSubHead("Getting Started");
            keyCourse.setBody("Click on START (Located on the bottom left of your screen) – Click on MY\n" +
                    "COMPUTER – Double click on your user drive. (The drive that ends with: (U:).)\n" +
                    "Create a new folder and name it: teched. (Note: all lower case letters and no spaces.)");
            courses.add(keyCourse);

            keyCourse = new KeyCourse();
            keyCourse.setId(3);
            keyCourse.setTitle("QBasic");
            keyCourse.setLevel("nd1");
            keyCourse.setSemester("first");
            keyCourse.setSubHead("Getting to QBasic");
            keyCourse.setBody("To run QBASIC we need to get to the QBasic editor.\n" +
                    "Click on START (Located on the bottom left of your screen) – Click on ALL\n" +
                    "PROGRAMS – click on: SHORTCUT TO MICROSOFT QUICK BASIC.\n" +
                    "This will open the editor. Press on the ESC (escape) key to clear the screen and exit the\n" +
                    "Survival guide.");
            courses.add(keyCourse);

            keyCourse = new KeyCourse();
            keyCourse.setId(4);
            keyCourse.setTitle("QBasic");
            keyCourse.setLevel("nd1");
            keyCourse.setSemester("first");
            keyCourse.setSubHead("QBasic Editor");
            keyCourse.setBody("Assuming you’ve used a computer before, the editing keys work in a similar way. The\n" +
                    "Left, Right, Up and Down arrows behave as one would expect – but, the Delete and\n" +
                    "Backspace keys are a little different. The Delete key deletes the character at the curser\n" +
                    "while the Backspace key deletes the character to the left.");
            courses.add(keyCourse);

            keyCourse = new KeyCourse();
            keyCourse.setId(5);
            keyCourse.setTitle("QBasic");
            keyCourse.setLevel("nd1");
            keyCourse.setSemester("first");
            keyCourse.setSubHead("First Program");
            keyCourse.setBody("Your First Program\n" +
                    "With the blinking cursor ( _ ) at the top-left corner of the screen, type this:\n" +
                    "PRINT \"Welcome to QBASIC. Your wish is my command.\"\n" +
                    "Make sure it looks exactly like that. The quotation marks (\") are very important. If you\n" +
                    "make any mistakes, use the Backspace or Delete key to correct them.");
            courses.add(keyCourse);

            keyCourse = new KeyCourse();
            keyCourse.setId(5);
            keyCourse.setTitle("QBasic");
            keyCourse.setLevel("nd1");
            keyCourse.setSemester("first");
            keyCourse.setSubHead("Do ... Loop");
            keyCourse.setBody("Let's start a new program. To get rid of the old program, click on \"File\" on QBASIC's\n" +
                    "menu and you will see the File menu with New, Open..., Save, and others. Click on\n" +
                    "\"New\". QBASIC may tell you that your current program is not saved, and it will ask\n" +
                    "if you want to \"Save it now?\". Click on < OK > with the mouse.\n" +
                    "Now you should have a clean blue screen. Type in this program:\n" +
                    "DO\n" +
                    "PRINT \"Ted was here \";\n" +
                    "LOOP\n" +
                    "Make sure you get the semi-colon (;) at the end of the PRINT line, and the space\n" +
                    "between the word \"here\" and the last quotation mark. You don't need to use my name,\n" +
                    "put yours in there instead (\"Jack was here \", or whatever).");
            courses.add(keyCourse);

            keyCourse = new KeyCourse();
            keyCourse.setId(6);
            keyCourse.setTitle("QBasic");
            keyCourse.setLevel("nd1");
            keyCourse.setSemester("first");
            keyCourse.setSubHead("Input");
            keyCourse.setBody("So far our programs have only talked to us. Let's write one that will listen. Get rid of\n" +
                    "the previous program by clicking on File, then New on QBASIC's menu. Click on <\n" +
                    "Ok > when it asks if you want to save the old program now. Try this:\n" +
                    "CLS\n" +
                    "INPUT \"Enter your name: \", Name$\n" +
                    "PRINT \"Hello, \"; Name$; \". How are you today?\"\n" +
                    "Don't forget the comma (,) between \"Enter your name: \" and Name$.\n" +
                    "Remember to save your work. The path for this program is: u:\\teched\\C6INPUT\n" +
                    "Run it. When it asks, type your name, then press the <Enter> key.");
            courses.add(keyCourse);

            keyCourse = new KeyCourse();
            keyCourse.setId(7);
            keyCourse.setTitle("QBasic");
            keyCourse.setLevel("nd1");
            keyCourse.setSemester("first");
            keyCourse.setSubHead("Variables");
            keyCourse.setBody("Variables hold letters and numbers. The dollar sign ($) means this variable can hold\n" +
                    "letters. These are called \"string variables\". Variables without a dollar sign can only\n" +
                    "hold numbers. We'll be seeing them soon.\n" +
                    "You can call your variables anything you want. Try going back through this program\n" +
                    "and changing every \"Name$\" to \"Fred$\". What happens when you run it?\n" +
                    "Another way to think of a variable is to imagine a small bucket with a name on it. Put\n" +
                    "\"Name$\" on it. This is the bucket's (variable's) name. Now take a piece of paper and\n" +
                    "write your name on it and drop it into the imaginary bucket. Now the variable Name$\n" +
                    "has your name in it. Computer variables can only hold one piece of paper (one value)\n" +
                    "at a time.");
            courses.add(keyCourse);

            keyCourse = new KeyCourse();
            keyCourse.setId(8);
            keyCourse.setTitle("QBasic");
            keyCourse.setLevel("nd1");
            keyCourse.setSemester("first");
            keyCourse.setSubHead("PRINT and Variables");
            keyCourse.setBody("When you want to PRINT what's in a variable, leave off the double-quotation marks\n" +
                    "(\"). This program will show you how this works:\n" +
                    "CLS\n" +
                    "INPUT \"Enter your name: \", Name$\n" +
                    "PRINT \"Name$\"\n" +
                    "PRINT Name$\n" +
                    "The first PRINT statement prints Name$ on the screen. The second PRINT statement\n" +
                    "prints whatever name you entered.");
            courses.add(keyCourse);


            keyCourse = new KeyCourse();
            keyCourse.setId(9);
            keyCourse.setTitle("QBasic");
            keyCourse.setLevel("nd1");
            keyCourse.setSemester("first");
            keyCourse.setSubHead("If...Then...Else");
            keyCourse.setBody("Let's make that last program a little smarter. I want to be able to identify intruders playing\n" +
                    "with my programs. Wouldn't it be great if the computer could recognize someone's name\n" +
                    "and print a special message for them? How about this:\n" +
                    "CLS\n" +
                    "INPUT \"Enter your name: \", Name$\n" +
                    "IF Name$=\"Mike\" THEN\n" +
                    "PRINT \"Go Away!\"\n" +
                    "ELSE\n" +
                    "PRINT \"Hello, \"; Name$; \". How are you today?\"\n" +
                    "END IF");
            courses.add(keyCourse);

            keyCourse = new KeyCourse();
            keyCourse.setId(10);
            keyCourse.setTitle("QBasic");
            keyCourse.setLevel("nd1");
            keyCourse.setSemester("first");
            keyCourse.setSubHead("CLS");
            keyCourse.setBody("Wouldn't it be nice to be able to clear off the screen before printing a new line? \"CLS\",\n" +
                    "which stands for CLear Screen, is just the ticket. You will need to put CLS at the very top\n" +
                    "of your program to clear the screen before you print anything.\n" +
                    "Inserting a new line at the top.\n" +
                    "To make CLS the first line of your program, follow these steps:\n" +
                    "Press the <Home> key to get to the beginning of the current line.\n" +
                    "Press the <Up Arrow> key once or twice to get the cursor to the top of the program.\n" +
                    "Press the <Enter> key to get a new line.\n" +
                    "Press the <Up Arrow> key once to get the cursor on the new blank line.\n" +
                    "Type CLS\n" +
                    "Now your program should look like this:\n" +
                    "CLS\n" +
                    "PRINT \"Welcome to QBASIC. Your wish is my command.\"");
            courses.add(keyCourse);

            // Fortran
            keyCourse = new KeyCourse();
            keyCourse.setId(1);
            keyCourse.setTitle("Fortran");
            keyCourse.setSemester("first");
            keyCourse.setSubHead("Introduction");
            keyCourse.setBody("Fortran, as derived from Formula Translating System, is a general-purpose, imperative\n" +
                    "programming language. It is used for numeric and scientific computing.\n" +
                    "Fortran was originally developed by IBM in the 1950s for scientific and engineering\n" +
                    "applications. Fortran ruled this programming area for a long time and became very popular\n" +
                    "for high performance computing, because.\n" +
                    "It supports:\n" +
                    "\uF0B7 Numerical analysis and scientific computation\n" +
                    "\uF0B7 Structured programming\n" +
                    "\uF0B7 Array programming\n" +
                    "\uF0B7 Modular programming\n" +
                    "\uF0B7 Generic programming\n" +
                    "\uF0B7 High performance computing on supercomputers\n" +
                    "\uF0B7 Object oriented programming\n" +
                    "\uF0B7 Concurrent programming\n" +
                    "\uF0B7 Reasonable degree of portability between computer systems");
            courses.add(keyCourse);

            keyCourse = new KeyCourse();
            keyCourse.setId(2);
            keyCourse.setTitle("Fortran");
            keyCourse.setSemester("first");
            keyCourse.setSubHead("Fact About Fortran");
            keyCourse.setBody("\uF0B7 Fortran was created by a team, led by John Backus at IBM in 1957.\n" +
                    "\uF0B7 Initially the name used to be written in all capital, but current standards and\n" +
                    "implementations only require the first letter to be capital.\n" +
                    "\uF0B7 Fortran stands for FORmula TRANslator.\n" +
                    "\uF0B7 Originally developed for scientific calculations, it had very limited support for character\n" +
                    "strings and other structures needed for general purpose programming.\n" +
                    "\uF0B7 Later extensions and developments made it into a high level programming language\n" +
                    "with good degree of portability.\n" +
                    "\uF0B7 Original versions, Fortran I, II and III are considered obsolete now.\n" +
                    "\uF0B7 Oldest version still in use is Fortran IV, and Fortran 66.\n" +
                    "\uF0B7 Most commonly used versions today are : Fortran 77, Fortran 90, and Fortran 95.");
            courses.add(keyCourse);

            keyCourse = new KeyCourse();
            keyCourse.setId(3);
            keyCourse.setTitle("Fortran");
            keyCourse.setSemester("first");
            keyCourse.setSubHead("Setting Up Environment");
            keyCourse.setBody("G95 is the GNU Fortran multi-architechtural compiler, used for setting up Fortran in Windows.\n" +
                    "The windows version emulates a unix environment using MingW under windows. The installer\n" +
                    "takes care of this and automatically adds g95 to the windows PATH variable.\n");
            courses.add(keyCourse);

            keyCourse = new KeyCourse();
            keyCourse.setId(4);
            keyCourse.setTitle("Fortran");
            keyCourse.setSemester("first");
            keyCourse.setSubHead("Setting Up Environment");
            keyCourse.setBody("G95 is the GNU Fortran multi-architechtural compiler, used for setting up Fortran in Windows.\n" +
                    "The windows version emulates a unix environment using MingW under windows. The installer\n" +
                    "takes care of this and automatically adds g95 to the windows PATH variable.\n");
            courses.add(keyCourse);

            keyCourse = new KeyCourse();
            keyCourse.setId(5);
            keyCourse.setTitle("Fortran");
            keyCourse.setSemester("first");
            keyCourse.setSubHead("Basic Syntax");
            keyCourse.setBody("A Fortran program is made of a collection of program units like a main program, modules,\n" +
                    "and external subprograms or procedures.\n" +
                    "Each program contains one main program and may or may not contain other program units.\n" +
                    "The syntax of the main program is as follows:\n" +
                    "program program_name\n" +
                    "implicit none\n" +
                    "! type declaration statements\n" +
                    "! executable statements\n" +
                    "end program program_name");
            courses.add(keyCourse);

            keyCourse = new KeyCourse();
            keyCourse.setId(5);
            keyCourse.setTitle("Fortran");
            keyCourse.setSemester("first");
            keyCourse.setSubHead("Simple Program");
            keyCourse.setBody("Let’s write a program that adds two numbers and prints the result:\n" +
                    "program addNumbers\n" +
                    "! This simple program adds two numbers\n" +
                    " implicit none\n" +
                    "\n" +
                    "! Type declarations\n" +
                    " real :: a, b, result\n" +
                    "\n" +
                    "! Executable statements\n" +
                    " a = 12.0\n" +
                    " b = 15.0\n" +
                    " result = a + b\n" +
                    " print *, 'The total is ', result\n" +
                    "\n" +
                    "end program addNumbers ");
            courses.add(keyCourse);

            keyCourse = new KeyCourse();
            keyCourse.setId(6);
            keyCourse.setTitle("Fortran");
            keyCourse.setSemester("first");
            keyCourse.setSubHead("Java Basics");
            keyCourse.setBody("The basic character set of Fortran contains:\n" +
                    "\uF0B7 the letters A ... Z and a ... z\n" +
                    "\uF0B7 the digits 0 ... 9\n" +
                    "\uF0B7 the underscore (_) character\n" +
                    "\uF0B7 the special characters = : + blank - * / ( ) [ ] , . $ ' ! \" % & ; < > ?\n" +
                    "Tokens are made of characters in the basic character set. A token could be a keyword, an\n" +
                    "identifier, a constant, a string literal, or a symbol.\n" +
                    "Program statements are made of tokens.");
            courses.add(keyCourse);

            keyCourse = new KeyCourse();
            keyCourse.setId(7);
            keyCourse.setTitle("Fortran");
            keyCourse.setSemester("first");
            keyCourse.setSubHead("Java Basics");
            keyCourse.setBody("The basic character set of Fortran contains:\n" +
                    "\uF0B7 the letters A ... Z and a ... z\n" +
                    "\uF0B7 the digits 0 ... 9\n" +
                    "\uF0B7 the underscore (_) character\n" +
                    "\uF0B7 the special characters = : + blank - * / ( ) [ ] , . $ ' ! \" % & ; < > ?\n" +
                    "Tokens are made of characters in the basic character set. A token could be a keyword, an\n" +
                    "identifier, a constant, a string literal, or a symbol.\n" +
                    "Program statements are made of tokens.");
            courses.add(keyCourse);

            keyCourse = new KeyCourse();
            keyCourse.setId(8);
            keyCourse.setTitle("Fortran");
            keyCourse.setSemester("first");
            keyCourse.setSubHead("Identifiers");
            keyCourse.setBody("An identifier is a name used to identify a variable, procedure, or any other user-defined item.\n" +
                    "A name in Fortran must follow the following rules:\n" +
                    "\uF0B7 It cannot be longer than 31 characters.\n" +
                    "\uF0B7 It must be composed of alphanumeric characters (all the letters of the alphabet, and\n" +
                    "the digits 0 to 9) and underscores (_)." +
                    "\uF0B7 First character of a name must be a letter.\n" +
                    "\uF0B7 Names are case-insensitive");
            courses.add(keyCourse);

            keyCourse = new KeyCourse();
            keyCourse.setId(9);
            keyCourse.setTitle("Fortran");
            keyCourse.setSemester("first");
            keyCourse.setSubHead("Keywords");
            keyCourse.setBody("Keywords are special words, reserved for the language. These reserved words cannot be used\n" +
                    "as identifiers or names.\n" +
                    "The following table, lists the Fortran keywords:");
            courses.add(keyCourse);

            keyCourse = new KeyCourse();
            keyCourse.setId(9);
            keyCourse.setTitle("Fortran");
            keyCourse.setSemester("first");
            keyCourse.setSubHead("Keywords");
            keyCourse.setBody("Keywords are special words, reserved for the language. These reserved words cannot be used\n" +
                    "as identifiers or names.\n" +
                    "The following table, lists the Fortran keywords:" +
                    "allocatable allocate assign assignment block data\n" +
                    "call case character common complex\n" +
                    "contains continue cycle data deallocate\n" +
                    "default do double precision else else if\n" +
                    "elsewhere end block data end do end function end if\n" +
                    "end interface end module end program end select end subroutine\n" +
                    "end type end where entry equivalence exit\n" +
                    "external function go to if implicit\n" +
                    "in inout integer intent interface\n" +
                    "intrinsic kind len logical module\n" +
                    "namelist nullify only operator optional\n" +
                    "out parameter pause pointer private");
            courses.add(keyCourse);

            keyCourse = new KeyCourse();
            keyCourse.setId(10);
            keyCourse.setTitle("Fortran");
            keyCourse.setSemester("first");
            keyCourse.setSubHead("Data Types");
            keyCourse.setBody("Fortran provides five intrinsic data types, however, you can derive your own data types as\n" +
                    "well. The five intrinsic types are:\n" +
                    "\uF0B7 Integer type\n" +
                    "\uF0B7 Real type\n" +
                    "\uF0B7 Complex type\n" +
                    "\uF0B7 Logical type\n" +
                    "\uF0B7 Character type");
            courses.add(keyCourse);

            keyCourse = new KeyCourse();
            keyCourse.setId(11);
            keyCourse.setTitle("Fortran");
            keyCourse.setSemester("first");
            keyCourse.setSubHead("Integer");
            keyCourse.setBody("The integer types can hold only integer values. The following example extracts the largest\n" +
                    "value that can be held in a usual four byte integer:\n" +
                    "program testingInt\n" +
                    "implicit none\n" +
                    " integer :: largeval\n" +
                    " print *, huge(largeval)\n" +
                    "\n" +
                    "end program testingInt");
            courses.add(keyCourse);

            keyCourse = new KeyCourse();
            keyCourse.setId(12);
            keyCourse.setTitle("Fortran");
            keyCourse.setSemester("first");
            keyCourse.setSubHead("Real Type");
            keyCourse.setBody("It stores the floating point numbers, such as 2.0, 3.1415, -100.876, etc.\n" +
                    "Traditionally there are two different real types, the default real type and double\n" +
                    "precisiontype.\n" +
                    "Fortran\n" +
                    "17\n" +
                    "However, Fortran 90/95 provides more control over the precision of real and integer data\n" +
                    "types through the kind specifier, which we will study in the chapter on Numbers.\n");
            courses.add(keyCourse);

            keyCourse = new KeyCourse();
            keyCourse.setId(13);
            keyCourse.setTitle("Fortran");
            keyCourse.setSemester("first");
            keyCourse.setSubHead("Complex Type");
            keyCourse.setBody("This is used for storing complex numbers. A complex number has two parts, the real part and\n" +
                    "the imaginary part. Two consecutive numeric storage units store these two parts.\n" +
                    "For example, the complex number (3.0, -5.0) is equal to 3.0 – 5.0i\n" +
                    "We will discuss Complex types in more detail, in the Numbers chapter.");
            courses.add(keyCourse);

            keyCourse = new KeyCourse();
            keyCourse.setId(14);
            keyCourse.setTitle("Fortran");
            keyCourse.setSemester("first");
            keyCourse.setSubHead("Logical Type");
            keyCourse.setBody("There are only two logical values: .true. and .false.");
            courses.add(keyCourse);

            keyCourse = new KeyCourse();
            keyCourse.setId(15);
            keyCourse.setTitle("Fortran");
            keyCourse.setSemester("first");
            keyCourse.setSubHead("Logical Type");
            keyCourse.setBody("There are only two logical values: .true. and .false.");
            courses.add(keyCourse);

            keyCourse = new KeyCourse();
            keyCourse.setId(15);
            keyCourse.setTitle("Fortran");
            keyCourse.setSemester("first");
            keyCourse.setSubHead("Character Type");
            keyCourse.setBody("The character type stores characters and strings. The length of the string can be specified by\n" +
                    "len specifier. If no length is specified, it is 1.\n" +
                    "For example,\n" +
                    "character (len=40) :: name\n" +
                    "name = “Zara Ali”");
            courses.add(keyCourse);

            keyCourse = new KeyCourse();
            keyCourse.setId(16);
            keyCourse.setTitle("Fortran");
            keyCourse.setSemester("first");
            keyCourse.setSubHead("Implicit Typing");
            keyCourse.setBody("Older versions of Fortran allowed a feature called implicit typing, i.e., you do not have to\n" +
                    "declare the variables before use. If a variable is not declared, then the first letter of its name\n" +
                    "will determine its type.\n" +
                    "Variable names starting with i, j, k, l, m, or n, are considered to be for integer variable and\n" +
                    "others are real variables. However, you must declare all the variables as it is good\n" +
                    "programming practice. For that you start your program with the statement:\n" +
                    "implicit none\n" +
                    "This statement turns off implicit typing.");
            courses.add(keyCourse);

            keyCourse = new KeyCourse();
            keyCourse.setId(17);
            keyCourse.setTitle("Fortran");
            keyCourse.setSemester("first");
            keyCourse.setSubHead("Variable");
            keyCourse.setBody("A variable is nothing but a name given to a storage area that our programs can manipulate.\n" +
                    "Each variable should have a specific type, which determines the size and layout of the\n" +
                    "variable's memory; the range of values that can be stored within that memory; and the set\n" +
                    "of operations that can be applied to the variable.\n" +
                    "The name of a variable can be composed of letters, digits, and the underscore character. A\n" +
                    "name in Fortran must follow the following rules:\n" +
                    "\uF0B7 It cannot be longer than 31 characters.\n" +
                    "\uF0B7 It must be composed of alphanumeric characters (all the letters of the alphabet, and\n" +
                    "the digits 0 to 9) and underscores (_).\n" +
                    "\uF0B7 First character of a name must be a letter.\n" +
                    "\uF0B7 Names are case-insensitive.");
            courses.add(keyCourse);

            keyCourse = new KeyCourse();
            keyCourse.setId(18);
            keyCourse.setTitle("Fortran");
            keyCourse.setSemester("first");
            keyCourse.setSubHead("Variable Declaration");
            keyCourse.setBody("Variables are declared at the beginning of a program (or subprogram) in a type declaration\n" +
                    "statement.\n" +
                    "Syntax for variable declaration is as follows:\n" +
                    "type-specifier :: variable_name\n" +
                    "For example,\n" +
                    "integer :: total\n" +
                    "real :: average\n" +
                    "complex :: cx\n" +
                    "logical :: done\n" +
                    "character(len=80) :: message ! a string of 80 characters");
            courses.add(keyCourse);

            keyCourse = new KeyCourse();
            keyCourse.setId(19);
            keyCourse.setTitle("Fortran");
            keyCourse.setSemester("first");
            keyCourse.setSubHead("Constants");
            keyCourse.setBody("keyCourse = new KeyCourse();\n" +
                    "            keyCourse.setId(18);\n" +
                    "            keyCourse.setTitle(\"Fortran\");\n" +
                    "            keyCourse.setSemester(\"first\");\n" +
                    "            keyCourse.setSubHead(\"Variable Declaration\");\n" +
                    "            keyCourse.setBody(\"Variables are declared at the beginning of a program (or subprogram) in a type declaration\\n\" +\n" +
                    "                    \"statement.\\n\" +\n" +
                    "                    \"Syntax for variable declaration is as follows:\\n\" +\n" +
                    "                    \"type-specifier :: variable_name\\n\" +\n" +
                    "                    \"For example,\\n\" +\n" +
                    "                    \"integer :: total\\n\" +\n" +
                    "                    \"real :: average\\n\" +\n" +
                    "                    \"complex :: cx\\n\" +\n" +
                    "                    \"logical :: done\\n\" +\n" +
                    "                    \"character(len=80) :: message ! a string of 80 characters\");\n" +
                    "            courses.add(keyCourse);");
            courses.add(keyCourse);

            keyCourse = new KeyCourse();
            keyCourse.setId(20);
            keyCourse.setTitle("Fortran");
            keyCourse.setSemester("first");
            keyCourse.setSubHead("Operators");
            keyCourse.setBody("An operator is a symbol that tells the compiler to perform specific mathematical or logical\n" +
                    "manipulations. Fortran provides the following types of operators:\n" +
                    "\uF0B7 Arithmetic Operators\n" +
                    "\uF0B7 Relational Operators\n" +
                    "\uF0B7 Logical Operators\n" +
                    "Let us look at all these types of operators one by one.");
            courses.add(keyCourse);

            // Java
            keyCourse = new KeyCourse();
            keyCourse.setId(1);
            keyCourse.setTitle("Java");
            keyCourse.setSubHead("Introduction");
            keyCourse.setBody("Java is a high-level programming language originally" +
                    " developed by Sun Microsystems and released in 1995. Java runs on a variety of platforms," +
                    " such as Windows, Mac OS, and the various versions of UNIX." +
                    " This tutorial gives a complete understanding of Java." +
                    " This reference will take you through simple and practical approaches while learning Java Programming language.");
            courses.add(keyCourse);

            keyCourse = new KeyCourse();
            keyCourse.setId(2);
            keyCourse.setTitle("Java");
            keyCourse.setSubHead("Why Java");
            keyCourse.setBody("Java is a MUST for students and working professionals to become a great Software Engineer specially when they are working in Software Development Domain. I will list down some of the key advantages of learning Java Programming:\n" +
                    "Object Oriented − In Java, everything is an Object. Java can be easily extended since it is based on the Object model.");
            courses.add(keyCourse);

            keyCourse = new KeyCourse();
            keyCourse.setId(3);
            keyCourse.setTitle("Java");
            keyCourse.setSubHead("Platform Independent");
            keyCourse.setBody("JPlatform Independent − Unlike many other programming languages including C and C++, when Java is compiled, it is not compiled into platform specific machine, rather into platform independent byte code. This byte code is distributed over the web and interpreted by the Virtual Machine (JVM) on whichever platform it is being run on.\n" +
                    "Simple − Java is designed to be easy to learn. If you understand the basic concept of OOP Java, it would be easy to master.");
            courses.add(keyCourse);

            keyCourse = new KeyCourse();
            keyCourse.setId(4);
            keyCourse.setTitle("Java");
            keyCourse.setSubHead("Secure");
            keyCourse.setBody("With Java's secure feature it enables to develop virus-free, tamper-free systems. Authentication techniques are based on public-key encryption.\n" +
                    "Architecture-neutral − Java compiler generates an architecture-neutral object file format, which makes the compiled code executable on many processors, with the presence of Java runtime system.");
            courses.add(keyCourse);

            keyCourse = new KeyCourse();
            keyCourse.setId(5);
            keyCourse.setTitle("Java");
            keyCourse.setSubHead("Portability");
            keyCourse.setBody("Being architecture-neutral and having no implementation dependent aspects of the specification makes Java portable. Compiler in Java is written in ANSI C with a clean portability boundary, which is a POSIX subset.\n" +
                    "Robust − Java makes an effort to eliminate error prone situations by emphasizing mainly on compile time error checking and runtime checking.");
            courses.add(keyCourse);

            keyCourse = new KeyCourse();
            keyCourse.setId(6);
            keyCourse.setTitle("Java");
            keyCourse.setSubHead("Java Ecosystem");
            keyCourse.setBody("When we consider a Java program, it can be defined as a collection of objects that communicate via invoking each other's methods. Let us now briefly look into what do class, object, methods, and instance variables mean.");
            courses.add(keyCourse);

            keyCourse = new KeyCourse();
            keyCourse.setId(7);
            keyCourse.setTitle("Java");
            keyCourse.setSubHead("Class");
            keyCourse.setBody("A class can be defined as a template/blueprint that describes the behavior/state that the object of its type supports.");
            courses.add(keyCourse);

            keyCourse = new KeyCourse();
            keyCourse.setId(8);
            keyCourse.setTitle("Java");
            keyCourse.setSubHead("Object");
            keyCourse.setBody("Objects have states and behaviors. Example: A dog has states - color, name, breed as well as behavior such as wagging their tail, barking, eating. An object is an instance of a class");
            courses.add(keyCourse);

            keyCourse = new KeyCourse();
            keyCourse.setId(9);
            keyCourse.setTitle("Java");
            keyCourse.setSubHead("Method");
            keyCourse.setBody("A method is basically a behavior. A class can contain many methods. It is in methods where the logics are written, data is manipulated and all the actions are executed.\n" +
                    "Instance Variables − Each object has its unique set of instance variables. An object's state is created by the values assigned to these instance variables.");
            courses.add(keyCourse);

            keyCourse = new KeyCourse();
            keyCourse.setId(10);
            keyCourse.setTitle("Java");
            keyCourse.setSubHead("Basic Syntax");
            keyCourse.setBody("About Java programs, it is very important to keep in mind the following points.\n" +
                    "Case Sensitivity − Java is case sensitive, which means identifier Hello and hello would have different meaning in Java.");
            courses.add(keyCourse);

            keyCourse = new KeyCourse();
            keyCourse.setId(11);
            keyCourse.setTitle("Java");
            keyCourse.setSubHead("Java Class Names");
            keyCourse.setBody("For all class names the first letter should be in Upper Case. If several words are used to form a name of the class, each inner word's first letter should be in Upper Case.\n" +
                    "Example: class MyFirstJavaClass");
            courses.add(keyCourse);

            keyCourse = new KeyCourse();
            keyCourse.setId(12);
            keyCourse.setTitle("Java");
            keyCourse.setSubHead("Methods");
            keyCourse.setBody("All method names should start with a Lower Case letter. If several words are used to form the name of the method, then each inner word's first letter should be in Upper Case.");
            courses.add(keyCourse);

            keyCourse = new KeyCourse();
            keyCourse.setId(13);
            keyCourse.setTitle("Java");
            keyCourse.setSubHead("Arrays");
            keyCourse.setBody("Arrays are objects that store multiple variables of the same type. However, an array itself is an object on the heap");
            courses.add(keyCourse);

            keyCourse = new KeyCourse();
            keyCourse.setId(14);
            keyCourse.setTitle("Java");
            keyCourse.setSubHead("Modifiers");
            keyCourse.setBody("Like other languages, it is possible to modify classes, methods, etc., by using modifiers. There are two categories of modifiers −\n" +
                    "Access Modifiers − default, public , protected, private\n" +
                    "Non-access Modifiers − final, abstract, strictfp\n" +
                    "We will be looking into more details about modifiers in the next section.\n" +
                    "Java Variables\n" +
                    "Following are the types of variables in Java −\n" +
                    "Local Variables\n" +
                    "Class Variables (Static Variables)");
            courses.add(keyCourse);

            keyCourse = new KeyCourse();
            keyCourse.setId(15);
            keyCourse.setTitle("Java");
            keyCourse.setSubHead("Identifiers");
            keyCourse.setBody("All Java components require names. Names used for classes, variables, and methods are called\n" +
                    "identifiers .\n" +
                    "In Java, there are several points to remember about identifiers. They are as follows −\n" +
                    "All identifiers should begin with a letter (A to Z or a to z), currency character ($) or an underscore (_).\n" +
                    "After the first character, identifiers can have any combination of characters.\n" +
                    "A key word cannot be used as an identifier.\n" +
                    "Most importantly, identifiers are case sensitive.\n" +
                    "Examples of legal identifiers: age, $salary, _value, __1_value.\n" +
                    "Examples of illegal identifiers: 123abc, -salary.\n" +
                    "Java Modifiers\n" +
                    "Like other languages, it is possible to modify classes, methods, etc., by using modifiers. There are two categories of modifiers −\n" +
                    "Access Modifiers − default, public , protected, private\n" +
                    "Non-access Modifiers − final, abstract, strictfp\n" +
                    "We will be looking into more details about modifiers in the next section.\n" +
                    "Java Variables\n" +
                    "Following are the types of variables in Java −\n" +
                    "Local Variables\n" +
                    "Class Variables (Static Variables)\n" +
                    "Instance Variables (Non-static Variables)");
            courses.add(keyCourse);

            keyCourse = new KeyCourse();
            keyCourse.setId(16);
            keyCourse.setTitle("Java");
            keyCourse.setSubHead("Java Enum");
            keyCourse.setBody("Enums were introduced in Java 5.0. Enums restrict a variable to have one of only a few predefined values. The values in this enumerated list are called enums.\n" +
                    "With the use of enums it is possible to reduce the number of bugs in your code.\n" +
                    "For example, if we consider an application for a fresh juice shop, it would be possible to restrict the glass size to small, medium, and large. This would make sure that it would not allow anyone to order any size other than small, medium, or large.");
            courses.add(keyCourse);

            keyCourse = new KeyCourse();
            keyCourse.setId(17);
            keyCourse.setTitle("Java");
            keyCourse.setSubHead("Local Variables");
            keyCourse.setBody("Variables defined inside methods, constructors or blocks are called local variables. The variable will be declared and initialized within the method and the variable will be destroyed when the method has completed");
            courses.add(keyCourse);

            keyCourse = new KeyCourse();
            keyCourse.setId(17);
            keyCourse.setTitle("Java");
            keyCourse.setSubHead("Instance Variables");
            keyCourse.setBody("Variables defined inside methods, constructors or blocks are called local variables. The variable will be declared and initialized within the method and the variable will be destroyed when the method has completed");
            courses.add(keyCourse);

            keyCourse = new KeyCourse();
            keyCourse.setId(17);
            keyCourse.setTitle("Java");
            keyCourse.setSubHead("Constructor");
            keyCourse.setBody("When discussing about classes, one of the most important sub topic would be constructors. Every class has a constructor. If we do not explicitly write a constructor for a class, the Java compiler builds a default constructor for that class.\n" +
                    "Each time a new object is created, at least one constructor will be invoked. The main rule of constructors is that they should have the same name as the class. A class can have more than one constructor");
            courses.add(keyCourse);


            keyCourse = new KeyCourse();
            keyCourse.setId(18);
            keyCourse.setTitle("Java");
            keyCourse.setSubHead("Access Control Modifier");
            keyCourse.setBody("Java provides a number of access modifiers to set access levels for classes, variables, methods and constructors. The four access levels are −\n" +
                    "Visible to the package, the default. No modifiers are needed.\n" +
                    "Visible to the class only (private).\n" +
                    "Visible to the world (public).\n" +
                    "Visible to the package and all subclasses (protected).");
            courses.add(keyCourse);

            keyCourse = new KeyCourse();
            keyCourse.setId(19);
            keyCourse.setTitle("Java");
            keyCourse.setSubHead("Non Access Control Modifier");
            keyCourse.setBody("Java provides a number of non-access modifiers to achieve many other functionality.\n" +
                    "The static modifier for creating class methods and variables.\n" +
                    "The final modifier for finalizing the implementations of classes, methods, and variables.\n" +
                    "The abstract modifier for creating abstract classes and methods.\n" +
                    "The synchronized and\n" +
                    "volatile modifiers, which are used for threads.");
            courses.add(keyCourse);

            keyCourse = new KeyCourse();
            keyCourse.setId(20);
            keyCourse.setTitle("Java");
            keyCourse.setSubHead("Class and Static");
            keyCourse.setBody("Class variables also known as static variables are declared with the static keyword in a class, but outside a method, constructor or a block.\n" +
                    "There would only be one copy of each class variable per class, regardless of how many objects are created from it.\n" +
                    "Static variables are rarely used other than being declared as constants. Constants are variables that are declared as public/private, final, and static. Constant variables never change from their initial value.\n" +
                    "Static variables are stored in the static memory. It is rare to use static variables other than declared final and used as either public or private constants.\n" +
                    "Static variables are created when the program starts and destroyed when the program stops.\n" +
                    "Visibility is similar to instance variables. However, most static variables are declared public since they must be available for users of the class.\n" +
                    "Default values are same as instance variables. For numbers, the default value is 0; for Booleans, it is false; and for object references, it is null. Values can be assigned during the declaration or within the constructor. Additionally, values can be assigned in special static initializer blocks.\n" +
                    "Static variables can be accessed by calling with the class name\n" +
                    "ClassName.VariableName .\n" +
                    "When declaring class variables as public static final, then variable names (constants) are all in upper case. If the static variables are not public and final, the naming syntax is the same as instance and local variables.");
            courses.add(keyCourse);


            keyCourse = new KeyCourse();
            keyCourse.setId(21);
            keyCourse.setTitle("Java");
            keyCourse.setSubHead("Operators");
            keyCourse.setBody("Java provides a rich set of operators to manipulate variables. We can divide all the Java operators into the following groups −\n" +
                    "Arithmetic Operators\n" +
                    "Relational Operators\n" +
                    "Bitwise Operators\n" +
                    "Logical Operators\n" +
                    "Assignment Operators\n" +
                    "Misc Operators");
            courses.add(keyCourse);


            // Visual Basic
            keyCourse = new KeyCourse();
            keyCourse.setId(1);
            keyCourse.setTitle("Visual Basic");
            keyCourse.setSubHead("Introduction");
            keyCourse.setBody("VB.Net is an object-oriented programming language. In Object-Oriented Programming methodology, a program consists of various objects that interact with each other by means of actions. The actions that an object may take are called methods. Objects of the same kind are said to have the same type or, more often, are said to be in the same class.\n" +
                    "When we consider a VB.Net program, it can be defined as a collection of objects that communicate via invoking each other's methods. Let us now briefly look into what do class, object, methods and instance variables mean.");
            courses.add(keyCourse);

            keyCourse = new KeyCourse();
            keyCourse.setId(2);
            keyCourse.setTitle("Visual Basic");
            keyCourse.setSubHead("Objects");
            keyCourse.setBody("Objects have states and behaviors. Example: A dog has states - color, name, breed as well as behaviors - wagging, barking, eating, etc. An object is an instance of a class.");
            courses.add(keyCourse);

            keyCourse = new KeyCourse();
            keyCourse.setId(3);
            keyCourse.setTitle("Visual Basic");
            keyCourse.setSubHead("Classes");
            keyCourse.setBody("A class can be defined as a template/blueprint that describes the behaviors/states that objects of its type support");
            courses.add(keyCourse);


            keyCourse = new KeyCourse();
            keyCourse.setId(4);
            keyCourse.setTitle("Visual Basic");
            keyCourse.setSubHead("Methods");
            keyCourse.setBody("A method is basically a behavior. A class can contain many methods. It is in methods where the logics are written, data is manipulated and all the actions are executed.\n" +
                    "Instance Variables − Each object has its unique set of instance variables. An object's state is created by the values assigned to these instance variables.");
            courses.add(keyCourse);

            keyCourse = new KeyCourse();
            keyCourse.setId(5);
            keyCourse.setTitle("Visual Basic");
            keyCourse.setSubHead("Data Types");
            keyCourse.setBody("Data types refer to an extensive system used for declaring variables or functions of different types. The type of a variable determines how much space it occupies in storage and how the bit pattern stored is interpreted.\n" +
                    "Data Types Available in VB.Net\n" +
                    "VB.Net provides a wide range of data types. The following table shows all the data types available −\n" +
                    "Data Type\n" +
                    "Storage Allocation\n" +
                    "Value Range\n" +
                    "Boolean Depends on implementing platform\n" +
                    "True or False\n" +
                    "Byte 1 byte 0 through 255 (unsigned)\n" +
                    "Char 2 bytes 0 through 65535 (unsigned)\n" +
                    "Date 8 bytes 0:00:00 (midnight) on January 1, 0001 through 11:59:59 PM on December 31, 9999\n" +
                    "Decimal 16 bytes 0 through +/-79,228,162,514,264,337,593,543,950,335 (+/-7.9...E+28) with no decimal point; 0 through +/-7.9228162514264337593543950335 with 28 places to the right of the decimal\n" +
                    "Double 8 bytes -1.79769313486231570E+308 through -4.94065645841246544E-324, for negative values\n" +
                    "4.94065645841246544E-324 through 1.79769313486231570E+308, for positive values\n" +
                    "Integer 4 bytes -2,147,483,648 through 2,147,483,647 (signed)\n" +
                    "Long 8 bytes -9,223,372,036,854,775,808 through 9,223,372,036,854,775,807(signed)\n" +
                    "Object 4 bytes on 32-bit platform\n" +
                    "8 bytes on 64-bit platform\n" +
                    "Any type can be stored in a variable of type Object\n" +
                    "SByte 1 byte -128 through 127 (signed)\n" +
                    "Short 2 bytes -32,768 through 32,767 (signed)\n" +
                    "Single 4 bytes -3.4028235E+38 through -1.401298E-45 for negative values;\n" +
                    "1.401298E-45 through 3.4028235E+38 for positive values\n" +
                    "String Depends on implementing platform\n" +
                    "0 to approximately 2 billion Unicode characters\n" +
                    "UInteger 4 bytes 0 through 4,294,967,295 (unsigned)\n" +
                    "ULong 8 bytes 0 through 18,446,744,073,709,551,615 (unsigned)\n" +
                    "User-Defined\n" +
                    "Depends on implementing platform\n" +
                    "Each member of the structure has a range determined by its data type and independent of the ranges of the other members\n" +
                    "UShort 2 bytes 0 through 65,535 (unsigned)");
            courses.add(keyCourse);

            keyCourse = new KeyCourse();
            keyCourse.setId(6);
            keyCourse.setTitle("Visual Basic");
            keyCourse.setSubHead("Variables");
            keyCourse.setBody("A variable is nothing but a name given to a storage area that our programs can manipulate. Each variable in VB.Net has a specific type, which determines the size and layout of the variable's memory; the range of values that can be stored within that memory; and the set of operations that can be applied to the variable.\n" +
                    "We have already discussed various data types. The basic value types provided in VB.Net can be categorized as −\n" +
                    "Type Example\n" +
                    "Integral types\n" +
                    "SByte, Byte, Short, UShort, Integer, UInteger, Long, ULong and Char\n" +
                    "Floating point types\n" +
                    "Single and Double\n" +
                    "Decimal types\n" +
                    "Decimal\n" +
                    "Boolean types\n" +
                    "True or False values, as assigned\n" +
                    "Date types\n" +
                    "Date\n" +
                    "VB.Net also allows defining other value types of variable like Enum and reference types of variables like Class. We will discuss date types and Classes in subsequent chapters.\n" +
                    "Variable Declaration in VB.Net\n" +
                    "The Dim statement is used for variable declaration and storage allocation for one or more variables. The Dim statement is used at module, class, structure, procedure or block level.");
            courses.add(keyCourse);

            keyCourse = new KeyCourse();
            keyCourse.setId(7);
            keyCourse.setTitle("Visual Basic");
            keyCourse.setSubHead("Variables");
            keyCourse.setBody("A variable is nothing but a name given to a storage area that our programs can manipulate. Each variable in VB.Net has a specific type, which determines the size and layout of the variable's memory; the range of values that can be stored within that memory; and the set of operations that can be applied to the variable.\n" +
                    "We have already discussed various data types. The basic value types provided in VB.Net can be categorized as −\n" +
                    "Type Example\n" +
                    "Integral types\n" +
                    "SByte, Byte, Short, UShort, Integer, UInteger, Long, ULong and Char\n" +
                    "Floating point types\n" +
                    "Single and Double\n" +
                    "Decimal types\n" +
                    "Decimal\n" +
                    "Boolean types\n" +
                    "True or False values, as assigned\n" +
                    "Date types\n" +
                    "Date\n" +
                    "VB.Net also allows defining other value types of variable like Enum and reference types of variables like Class. We will discuss date types and Classes in subsequent chapters.\n" +
                    "Variable Declaration in VB.Net\n" +
                    "The Dim statement is used for variable declaration and storage allocation for one or more variables. The Dim statement is used at module, class, structure, procedure or block level.");
            courses.add(keyCourse);

            keyCourse = new KeyCourse();
            keyCourse.setId(8);
            keyCourse.setTitle("Visual Basic");
            keyCourse.setSubHead("Constants");
            keyCourse.setBody("The constants refer to fixed values that the program may not alter during its execution. These fixed values are also called literals.\n" +
                    "Constants can be of any of the basic data types like an integer constant, a floating constant, a character constant, or a string literal. There are also enumeration constants as well.\n" +
                    "The constants are treated just like regular variables except that their values cannot be modified after their definition.\n" +
                    "An enumeration is a set of named integer constants.\n" +
                    "Declaring Constants\n" +
                    "In VB.Net, constants are declared using the Const statement. The Const statement is used at module, class, structure, procedure, or block level for use in place of literal values.");
            courses.add(keyCourse);

            keyCourse = new KeyCourse();
            keyCourse.setId(9);
            keyCourse.setTitle("Visual Basic");
            keyCourse.setSubHead("Modifier");
            keyCourse.setBody("The modifiers are keywords added with any programming element to give some especial emphasis on how the programming element will behave or will be accessed in the program.\n" +
                    "For example, the access modifiers: Public, Private, Protected, Friend, Protected Friend, etc., indicate the access level of a programming element like a variable, constant, enumeration or a class.\n" +
                    "List of Available Modifiers in VB.Net\n" +
                    "The following table provides the complete list of VB.Net modifiers ");
            courses.add(keyCourse);

            keyCourse = new KeyCourse();
            keyCourse.setId(10);
            keyCourse.setTitle("Visual Basic");
            keyCourse.setSubHead("Modifier");
            keyCourse.setBody("Ansi Specifies that Visual Basic should marshal all strings to American National Standards Institute (ANSI) values regardless of the name of the external procedure being declared.");
            courses.add(keyCourse);

            keyCourse = new KeyCourse();
            keyCourse.setId(11);
            keyCourse.setTitle("Visual Basic");
            keyCourse.setSubHead("Modifier");
            keyCourse.setBody("Assembly Specifies that an attribute at the beginning of a source file applies to the entire assembly.");
            courses.add(keyCourse);

            keyCourse = new KeyCourse();
            keyCourse.setId(11);
            keyCourse.setTitle("Visual Basic");
            keyCourse.setSubHead("Modifier");
            keyCourse.setBody("Async Indicates that the method or lambda expression that it modifies is asynchronous. Such methods are referred to as async methods. The caller of an async method can resume its work without waiting for the async method to finish.");
            courses.add(keyCourse);

            keyCourse = new KeyCourse();
            keyCourse.setId(12);
            keyCourse.setTitle("Visual Basic");
            keyCourse.setSubHead("Modifier");
            keyCourse.setBody("Auto The\n" +
                    "charsetmodifier part in the Declare statement supplies the character set information for marshaling strings during a call to the external procedure. It also affects how Visual Basic searches the external file for the external procedure name. The Auto modifier specifies that Visual Basic should marshal strings according to .NET Framework rules.");
            courses.add(keyCourse);

            keyCourse = new KeyCourse();
            keyCourse.setId(13);
            keyCourse.setTitle("Visual Basic");
            keyCourse.setSubHead("Modifier");
            keyCourse.setBody("ByRef Specifies that an argument is passed by reference, i.e., the called procedure can change the value of a variable underlying the argument in the calling code. It is used under the contexts of −\n" +
                    "Declare Statement\n" +
                    "Function Statement\n" +
                    "Sub Statement");
            courses.add(keyCourse);

            keyCourse = new KeyCourse();
            keyCourse.setId(14);
            keyCourse.setTitle("Visual Basic");
            keyCourse.setSubHead("Modifier");
            keyCourse.setBody("ByVal Specifies that an argument is passed in such a way that the called procedure or property cannot change the value of a variable underlying the argument in the calling code. It is used under the contexts of −\n" +
                    "Declare Statement\n" +
                    "Function Statement\n" +
                    "Operator Statement\n" +
                    "Property Statement\n" +
                    "Sub Statement");
            courses.add(keyCourse);

            keyCourse = new KeyCourse();
            keyCourse.setId(15);
            keyCourse.setTitle("Visual Basic");
            keyCourse.setSubHead("Statement");
            keyCourse.setBody("A statement is a complete instruction in Visual Basic programs. It may contain keywords, operators, variables, literal values, constants and expressions.\n" +
                    "Statements could be categorized as −\n" +
                    "Declaration statements − these are the statements where you name a variable, constant, or procedure, and can also specify a data type.\n" +
                    "Executable statements − these are the statements, which initiate actions. These statements can call a method or function, loop or branch through blocks of code or assign values or expression to a variable or constant. In the last case, it is called an Assignment statement.");
            courses.add(keyCourse);

            keyCourse = new KeyCourse();
            keyCourse.setId(16);
            keyCourse.setTitle("Visual Basic");
            keyCourse.setSubHead("Compiler");
            keyCourse.setBody("The VB.Net compiler directives give instructions to the compiler to preprocess the information before actual compilation starts. All these directives begin with #, and only white-space characters may appear before a directive on a line. These directives are not statements.\n" +
                    "VB.Net compiler does not have a separate preprocessor; however, the directives are processed as if there was one. In VB.Net, the compiler directives are used to help in conditional compilation. Unlike C and C++ directives, they are not used to create macros.\n" +
                    "Compiler Directives in VB.Net\n" +
                    "VB.Net provides the following set of compiler directives −\n" +
                    "The #Const Directive\n" +
                    "The #ExternalSource Directive\n" +
                    "The #If...Then...#Else Directives\n" +
                    "The #Region Directive.");
            courses.add(keyCourse);

            // Android
            keyCourse = new KeyCourse();
            keyCourse.setId(1);
            keyCourse.setTitle("Android");
            keyCourse.setSubHead("Introduction");
            keyCourse.setBody("Android is an open source and Linux-based Operating System for mobile devices such as\n" +
                    "smartphones and tablet computers. Android was developed by the Open Handset Alliance, led\n" +
                    "by Google, and other companies.\n" +
                    "Android offers a unified approach to application development for mobile devices which means\n" +
                    "developers need to develop only for Android, and their applications should be able to run on\n" +
                    "different devices powered by Android.\n" +
                    "The first beta version of the Android Software Development Kit (SDK) was released by Google\n" +
                    "in 2007, whereas the first commercial version, Android 1.0, was released in September 2008.\n" +
                    "On June 27, 2012, at the Google I/O conference, Google announced the next Android version,\n" +
                    "4.1 Jelly Bean. Jelly Bean is an incremental update, with the primary aim of improving the\n" +
                    "user interface, both in terms of functionality and performance.\n" +
                    "The source code for Android is available under free and open source software licenses. Google\n" +
                    "publishes most of the code under the Apache License version 2.0 and the rest, Linux kernel\n" +
                    "changes, under the GNU General Public License version 2.");
            courses.add(keyCourse);

            keyCourse = new KeyCourse();
            keyCourse.setId(2);
            keyCourse.setTitle("Android");
            keyCourse.setSubHead("Features of Android");
            keyCourse.setBody("Android is a powerful operating system competing with Apple 4GS and support great features.\n" +
                    "Few of them are listed below:\n" +
                    "Feature Description\n" +
                    "Beautiful UI Android OS basic screen provides a beautiful and intuitive user\n" +
                    "interface.\n" +
                    "Connectivity GSM/EDGE, IDEN, CDMA, EV-DO, UMTS, Bluetooth, Wi-Fi, LTE, NFC\n" +
                    "and WiMAX.\n" +
                    "Storage SQLite, a lightweight relational database, is used for data storage\n" +
                    "purposes." +
                    "Media support H.263, H.264, MPEG-4 SP, AMR, AMR-WB, AAC, HE-AAC, AAC 5.1,\n" +
                    "MP3, MIDI, Ogg Vorbis, WAV, JPEG, PNG, GIF, and BMP\n" +
                    "Messaging SMS and MMS\n" +
                    "Web browser Based on the open-source WebKit layout engine, coupled with\n" +
                    "Chrome's V8 JavaScript engine supporting HTML5 and CSS3.\n" +
                    "Multi-touch Android has native support for multi-touch which was initially made\n" +
                    "available in handsets such as the HTC Hero.\n" +
                    "Multi-tasking User can jump from one task to another and same time various\n" +
                    "application can run simultaneously.\n" +
                    "Resizable widgets Widgets are resizable, so users can expand them to show more\n" +
                    "content or shrink them to save space\n" +
                    "Multi-Language Support single direction and bi-directional text.\n" +
                    "GCM Google Cloud Messaging (GCM) is a service that let developers send\n" +
                    "short message data to their users on Android devices, without\n" +
                    "needing a proprietary sync solution.\n" +
                    "Wi-Fi Direct A technology that let apps discover and pair directly, over a highbandwidth peer-to-peer connection.\n" +
                    "Android Beam A popular NFC-based technology that let users instantly share, just\n" +
                    "by touching two NFC-enabled phones together.\n");
            courses.add(keyCourse);

            keyCourse = new KeyCourse();
            keyCourse.setId(3);
            keyCourse.setTitle("Android");
            keyCourse.setSubHead("Android Application");
            keyCourse.setBody("Android applications are usually developed in the Java language using the Android Software\n" +
                    "Development Kit.\n" +
                    "Once developed, Android applications can be packaged easily and sold out either through a\n" +
                    "store such as Google Play or the Amazon Appstore.\n" +
                    "Android powers hundreds of millions of mobile devices in more than 190 countries around the\n" +
                    "world. It's the largest installed base of any mobile platform and is growing fast. Every day\n" +
                    "more than 1 million new Android devices are activated worldwide.\n" +
                    "This tutorial has been written with an aim to teach you how to develop and package Android\n" +
                    "application. We will start from environment setup for Android application programming and\n" +
                    "then drill down to look into various aspects of Android applications.");
            courses.add(keyCourse);

            keyCourse = new KeyCourse();
            keyCourse.setId(4);
            keyCourse.setTitle("Android");
            keyCourse.setSubHead("Environment Setup");
            keyCourse.setBody("You will be glad to know that you can start your Android application development on either of\n" +
                    "the following operating systems:\n" +
                    "\uF0B7 Microsoft Windows XP or later version.\n" +
                    "\uF0B7 Mac OS X 10.5.8 or later version with Intel chip.\n" +
                    "\uF0B7 Linux including GNU C Library 2.7 or later.\n" +
                    "Second point is that all the required tools to develop Android applications are freely available\n" +
                    "and can be downloaded from the Web. Following is the list of software's you will need before\n" +
                    "you start your Android application programming.\n" +
                    "\uF0B7 Java JDK5 or JDK6\n" +
                    "\uF0B7 Android SDK\n" +
                    "\uF0B7 Eclipse IDE for Java Developers (optional)\n" +
                    "\uF0B7 Android Development Tools (ADT) Eclipse Plugin (optional)\n" +
                    "Here last two components are optional and if you are working on Windows machine then these\n" +
                    "components make your life easy while doing Java based application development. So let us\n" +
                    "have a look at how to proceed to set the required environment.");
            courses.add(keyCourse);

            keyCourse = new KeyCourse();
            keyCourse.setId(5);
            keyCourse.setTitle("Android");
            keyCourse.setSubHead("Step 1");
            keyCourse.setBody("You can download the latest version of Java JDK from Oracle's Java site: Java SE Downloads.\n" +
                    "You will find instructions for installing JDK in downloaded files, follow the given instructions\n" +
                    "to install and configure the setup. Finally, set PATH and JAVA_HOME environment variables\n" +
                    "to refer to the directory that contains java and javac, typically java_install_dir/bin and\n" +
                    "java_install_dir respectively.\n" +
                    "If you are running Windows and have installed the JDK in C:\\jdk1.6.0_15, you would have to\n" +
                    "put the following line in your C:\\autoexec.bat file.\n" +
                    "set PATH=C:\\jdk1.6.0_15\\bin;%PATH%\n" +
                    "set JAVA_HOME=C:\\jdk1.6.0_15\n" +
                    "Alternatively, you could also right-click on My Computer, select Properties, then Advanced,\n" +
                    "then Environment Variables. Then, you would update the PATH value and press the OK button.\n" +
                    "On Linux, if the SDK is installed in /usr/local/jdk1.6.0_15 and you use the C shell, you would\n" +
                    "put the following code into your .cshrc file.\n" +
                    "setenv PATH /usr/local/jdk1.6.0_15/bin:$PATH\n" +
                    "setenv JAVA_HOME /usr/local/jdk1.6.0_15\n" +
                    "Alternatively, if you use an Integrated Development Environment (IDE) Eclipse, then it will\n" +
                    "know automatically where you have installed your Java.\n");
            courses.add(keyCourse);

            keyCourse = new KeyCourse();
            keyCourse.setId(6);
            keyCourse.setTitle("Android");
            keyCourse.setSubHead("Step 2");
            keyCourse.setBody("You can download the latest version of Android SDK from Android’s official\n" +
                    "website: http://developer.android.com/sdk/index.html. If you are installing SDK on Windows\n" +
                    "machine, then you will find ainstaller_rXX-windows.exe, so just download and run this exe\n" +
                    "which will launch Android SDK Tool Setup wizard to guide you throughout the installation, so\n" +
                    "just follow the instructions carefully. Finally, you will have Android SDK Tools installed on your\n" +
                    "machine.\n" +
                    "If you are installing SDK either on Mac OS or Linux, check the instructions provided along\n" +
                    "with the downloaded android-sdk_rXX-macosx.zip file for Mac OS and android-sdk_rXXlinux.tgz file for Linux. This tutorial will consider that you are going to setup your environment\n" +
                    "on Windows machine having Windows 7 operating system.\n");
            courses.add(keyCourse);

            keyCourse = new KeyCourse();
            keyCourse.setId(7);
            keyCourse.setTitle("Android");
            keyCourse.setSubHead("Step 3");
            keyCourse.setBody("All the examples in this tutorial have been written using Eclipse IDE. So we would suggest\n" +
                    "you should have latest version of Eclipse installed on your machine.\n" +
                    "To install Eclipse IDE, download the latest Eclipse binaries from\n" +
                    "http://www.eclipse.org/downloads/. Once you have downloaded the installation, unpack the\n" +
                    "binary distribution into a convenient location. For example in C:\\eclipse on windows, or\n" +
                    "/usr/local/eclipse on Linux and finally set PATH variable appropriately.");
            courses.add(keyCourse);

            keyCourse = new KeyCourse();
            keyCourse.setId(8);
            keyCourse.setTitle("Android");
            keyCourse.setSubHead("Step 4");
            keyCourse.setBody("This step will help you in setting Android Development Tool plugin for Eclipse. Let's start with\n" +
                    "launching Eclipse and then, choose Help > Software Updates > Install New Software.\n" +
                    "This will display the following dialogue box.");
            courses.add(keyCourse);

            keyCourse = new KeyCourse();
            keyCourse.setId(9);
            keyCourse.setTitle("Android");
            keyCourse.setSubHead("Step 5");
            keyCourse.setBody("To test your Android applications you will need a virtual Android device. So before we start\n" +
                    "writing our code, let us create an Android virtual device. Launch Android AVD Manager using\n" +
                    "Eclipse menu options Window > AVD Manager> which will launch Android AVD Manager.\n" +
                    "Use New button to create a new Android Virtual Device and enter the following information,\n" +
                    "before clicking Create AVD button.");
            courses.add(keyCourse);

            keyCourse = new KeyCourse();
            keyCourse.setId(10);
            keyCourse.setTitle("Android");
            keyCourse.setSubHead("Architecture");
            keyCourse.setBody("Android operating system is a stack of software components which is roughly divided into five\n" +
                    "sections and four main layers as shown below in the architecture diagram.\n");
            courses.add(keyCourse);

            keyCourse = new KeyCourse();
            keyCourse.setId(11);
            keyCourse.setTitle("Android");
            keyCourse.setSubHead("Linux Kernel");
            keyCourse.setBody("At the bottom of the layers is Linux - Linux 2.6 with approximately 115 patches. This provides\n" +
                    "basic system functionality like process management, memory management, device\n" +
                    "management like camera, keypad, display etc. Also, the kernel handles all the things that\n" +
                    "Linux is really good at, such as networking and a vast array of device drivers, which take the\n" +
                    "pain out of interfacing to peripheral hardware.");
            courses.add(keyCourse);

            keyCourse = new KeyCourse();
            keyCourse.setId(12);
            keyCourse.setTitle("Android");
            keyCourse.setSubHead("Libraries");
            keyCourse.setBody("On top of Linux kernel there is a set of libraries including open-source Web browser engine\n" +
                    "WebKit, well known library libc, SQLite database which is a useful repository for storage and\n" +
                    "sharing of application data, libraries to play and record audio and video, SSL libraries\n" +
                    "responsible for Internet security etc");
            courses.add(keyCourse);

            keyCourse = new KeyCourse();
            keyCourse.setId(13);
            keyCourse.setTitle("Android");
            keyCourse.setSubHead("Runtime");
            keyCourse.setBody("This is the third section of the architecture and available on the second layer from the bottom.\n" +
                    "This section provides a key component called Dalvik Virtual Machine which is a kind of Java\n" +
                    "Virtual Machine specially designed and optimized for Android.\n" +
                    "The Dalvik VM makes use of Linux core features like memory management and multithreading, which is intrinsic in the Java language. The Dalvik VM enables every Android\n" +
                    "application to run in its own process, with its own instance of the Dalvik virtual machine.\n" +
                    "The Android runtime also provides a set of core libraries which enable Android application\n" +
                    "developers to write Android applications using standard Java programming language.");
            courses.add(keyCourse);

            keyCourse = new KeyCourse();
            keyCourse.setId(13);
            keyCourse.setTitle("Android");
            keyCourse.setSubHead("Framework");
            keyCourse.setBody("The Application Framework layer provides many higher-level services to applications in the\n" +
                    "form of Java classes. Application developers are allowed to make use of these services in their\n" +
                    "applications.");
            courses.add(keyCourse);

            keyCourse = new KeyCourse();
            keyCourse.setId(14);
            keyCourse.setTitle("Android");
            keyCourse.setSubHead("Application");
            keyCourse.setBody("You will find all the Android application at the top layer. You will write your application to be\n" +
                    "installed on this layer only. Examples of such applications are Contacts Books, Browser,\n" +
                    "Games, etc.");
            courses.add(keyCourse);

            keyCourse = new KeyCourse();
            keyCourse.setId(15);
            keyCourse.setTitle("Android");
            keyCourse.setSubHead("Application Components");
            keyCourse.setBody("Application components are the essential building blocks of an Android application. These\n" +
                    "components are loosely coupled by the application manifest file AndroidManifest.xml that\n" +
                    "describes each component of the application and how they interact.");
            courses.add(keyCourse);

            keyCourse = new KeyCourse();
            keyCourse.setId(16);
            keyCourse.setTitle("Android");
            keyCourse.setSubHead("Activity");
            keyCourse.setBody("An activity represents a single screen with a user interface. For example, an email application\n" +
                    "might have one activity that shows a list of new emails, another activity to compose an email,\n" +
                    "and one for reading emails. If an application has more than one activity, then one of them\n" +
                    "should be marked as the activity that is presented when the application is launched.\n" +
                    "An activity is implemented as a subclass of Activity class as follows:\n" +
                    "public class MainActivity extends Activity\n" +
                    "{\n" +
                    "}\n");
            courses.add(keyCourse);

            keyCourse = new KeyCourse();
            keyCourse.setId(16);
            keyCourse.setTitle("Android");
            keyCourse.setSubHead("Service");
            keyCourse.setBody("A service is a component that runs in the background to perform long-running operations. For\n" +
                    "example, a service might play music in the background while the user is in a different\n" +
                    "application, or it might fetch data over the network without blocking user interaction with an\n" +
                    "activity.\n" +
                    "A service is implemented as a subclass of Service class as follows:\n" +
                    "public class MyService extends Service\n" +
                    "{\n" +
                    "}");
            courses.add(keyCourse);

            keyCourse = new KeyCourse();
            keyCourse.setId(17);
            keyCourse.setTitle("Android");
            keyCourse.setSubHead("Broadcast Receiver");
            keyCourse.setBody("Broadcast Receivers simply respond to broadcast messages from other applications or from\n" +
                    "the system. For example, applications can also initiate broadcasts to let other applications\n" +
                    "know that some data has been downloaded to the device and is available for them to use, so\n" +
                    "this is broadcast receiver who will intercept this communication and will initiate appropriate\n" +
                    "action.\n" +
                    "A broadcast receiver is implemented as a subclass of BroadcastReceiver class and each\n" +
                    "message is broadcasted as an Intent object.\n" +
                    "public class MyReceiver extends BroadcastReceiver\n" +
                    "{\n" +
                    "}");
            courses.add(keyCourse);

            keyCourse = new KeyCourse();
            keyCourse.setId(17);
            keyCourse.setTitle("Android");
            keyCourse.setSubHead("Content Providers");
            keyCourse.setBody("A content provider component supplies data from one application to others on request. Such\n" +
                    "requests are handled by the methods of the ContentResolver class. The data may be stored\n" +
                    "in the file system, the database or somewhere else entirely.\n" +
                    "A content provider is implemented as a subclass of ContentProvider class and must\n" +
                    "implement a standard set of APIs that enable other applications to perform transactions.\n" +
                    "public class MyContentProvider extends ContentProvider\n" +
                    "{" +
                    "}");
            courses.add(keyCourse);

            keyCourse = new KeyCourse();
            keyCourse.setId(18);
            keyCourse.setTitle("Android");
            keyCourse.setSubHead("Additional Components");
            keyCourse.setBody("There are additional components which will be used in the construction of above mentioned\n" +
                    "entities, their logic, and wiring between them. These components are:\n" +
                    "Components Description\n" +
                    "Fragments Represent a behavior or a portion of user interface in an Activity.\n" +
                    "Views UI elements that are drawn onscreen including buttons, lists\n" +
                    "forms etc.\n" +
                    "Layouts View hierarchies that control screen format and appearance of the\n" +
                    "views.\n" +
                    "Intents Messages wiring components together.\n" +
                    "Resources External elements, such as strings, constants and drawable\n" +
                    "pictures.\n" +
                    "Manifest Configuration file for the application.");
            courses.add(keyCourse);

            keyCourse = new KeyCourse();
            keyCourse.setId(19);
            keyCourse.setTitle("Android");
            keyCourse.setSubHead("Create Application");
            keyCourse.setBody("Let us start actual programming with Android Framework. Before you start writing your first\n" +
                    "example using Android SDK, you have to make sure that you have setup your Android\n" +
                    "development environment properly as explained in Android - Environment Setup tutorial. We\n" +
                    "also assume, that you have a little bit working knowledge with Eclipse IDE.\n" +
                    "So let us proceed to write a simple Android Application which will print \"Hello World!\"." +
                    "The first step is to create a simple Android Application using Eclipse IDE. Follow the option\n" +
                    "File -> New -> Project and finally select Android New Application wizard from the wizard\n" +
                    "list");
            courses.add(keyCourse);


            keyCourse = new KeyCourse();
            keyCourse.setId(20);
            keyCourse.setTitle("Android");
            keyCourse.setSubHead("The Manifest");
            keyCourse.setBody("Whatever component you develop as a part of your application, you must declare all its\n" +
                    "components in a manifest file called AndroidManifest.xml which resides at the root of the\n" +
                    "application project directory. This file works as an interface between Android OS and your\n" +
                    "application, so if you do not declare your component in this file, then it will not be considered\n" +
                    "by the OS. For example, a default manifest file will look like as following file:\n" +
                    "<manifest xmlns:android=\"http://schemas.android.com/apk/res/android\"\n" +
                    " package=\"com.example.helloworld\"\n" +
                    " android:versionCode=\"1\"\n" +
                    " android:versionName=\"1.0\" >" +
                    "<uses-sdk\n" +
                    " android:minSdkVersion=\"8\"\n" +
                    " android:targetSdkVersion=\"15\" />\n" +
                    " <application\n" +
                    " android:icon=\"@drawable/ic_launcher\"\n" +
                    " android:label=\"@string/app_name\"\n" +
                    " android:theme=\"@style/AppTheme\" >\n" +
                    " <activity\n" +
                    " android:name=\".MainActivity\"\n" +
                    " android:label=\"@string/title_activity_main\" >\n" +
                    " <intent-filter>\n" +
                    " <action android:name=\"android.intent.action.MAIN\" />\n" +
                    " <category\n" +
                    "android:name=\"android.intent.category.LAUNCHER\"/>\n" +
                    " </intent-filter>\n" +
                    " </activity>\n" +
                    " </application>\n" +
                    "</manifest>");
            courses.add(keyCourse);


            // Pascal
            keyCourse = new KeyCourse();
            keyCourse.setId(1);
            keyCourse.setTitle("Pascal");
            keyCourse.setSubHead("Introduction");
            keyCourse.setBody("Pascal is a general-purpose, high-level language that was originally developed by\n" +
                    "Niklaus Wirth in the early 1970s. It was developed for teaching programming as a\n" +
                    "systematic discipline and to develop reliable and efficient programs.\n" +
                    "Pascal is Algol-based language and includes many constructs of Algol. Algol 60 is a\n" +
                    "subset of Pascal. Pascal offers several data types and programming structures. It is\n" +
                    "easy to understand and maintain the Pascal programs.\n" +
                    "Pascal has grown in popularity in the teaching and academics arena for various\n" +
                    "reasons:\n" +
                    "\uF0B7 Easy to learn.\n" +
                    "\uF0B7 Structured language.\n" +
                    "\uF0B7 It produces transparent, efficient, and reliable programs.\n" +
                    "\uF0B7 It can be compiled on a variety of computer platforms.");
            courses.add(keyCourse);

            keyCourse = new KeyCourse();
            keyCourse.setId(2);
            keyCourse.setTitle("Pascal");
            keyCourse.setSubHead("Features of Pascal");
            keyCourse.setBody("Pascal has the following features:\n" +
                    "\uF0B7 Pascal is a strongly typed language.\n" +
                    "\uF0B7 It offers extensive error checking.\n" +
                    "\uF0B7 It offers several data types like arrays, records, files, and sets.\n" +
                    "\uF0B7 It offers a variety of programming structures.\n" +
                    "\uF0B7 It supports structured programming through functions and procedures.\n" +
                    "\uF0B7 It supports object oriented programming.");
            courses.add(keyCourse);

            keyCourse = new KeyCourse();
            keyCourse.setId(2);
            keyCourse.setTitle("Pascal");
            keyCourse.setSubHead("Fact About Pascal");
            keyCourse.setBody("\uF0B7 The Pascal language was named for Blaise Pascal, French mathematician and\n" +
                    "pioneer in computer development.\n" +
                    "\uF0B7 Niklaus Wirth completed development of the original Pascal programming\n" +
                    "language in 1970.\n" +
                    "\uF0B7 Pascal is based on the block structured style of the Algol programming\n" +
                    "language.\n" +
                    "\uF0B7 Pascal was developed as a language suitable for teaching programming as a\n" +
                    "systematic discipline, whose implementations could be both reliable and\n" +
                    "efficient.\n" +
                    "\uF0B7 The ISO 7185 Pascal Standard was originally published in 1983.\n" +
                    "\uF0B7 Pascal was the primary high-level language used for development in the Apple\n" +
                    "Lisa, and in the early years of the Mac.\n" +
                    "\uF0B7 In 1986, Apple Computer released the first Object Pascal implementation, and\n" +
                    "in 1993, the Pascal Standards Committee published an Object-Oriented\n" +
                    "Extension to Pascal.");
            courses.add(keyCourse);

            keyCourse = new KeyCourse();
            keyCourse.setId(3);
            keyCourse.setTitle("Pascal");
            keyCourse.setSubHead("Why Pascal");
            keyCourse.setBody("Pascal allows the programmers to define complex structured data types and build\n" +
                    "dynamic and recursive data structures, such as lists, trees and graphs. Pascal offers\n" +
                    "features like records, enumerations, subranges, dynamically allocated variables with\n" +
                    "associated pointers and sets.\n" +
                    "Pascal allows nested procedure definitions to any level of depth. This truly provides\n" +
                    "a great programming environment for learning programming as a systematic\n" +
                    "discipline based on the fundamental concepts.\n" +
                    "Among the most amazing implementations of Pascal are:\n" +
                    "\uF0B7 Skype\n" +
                    "\uF0B7 Total Commander\n" +
                    "\uF0B7 TeX\n" +
                    "\uF0B7 Macromedia Captivate\n" +
                    "\uF0B7 Apple Lisa\n" +
                    "\uF0B7 Various PC Games\n" +
                    "\uF0B7 Embedded Systems");
            courses.add(keyCourse);

            keyCourse = new KeyCourse();
            keyCourse.setId(5);
            keyCourse.setTitle("Pascal");
            keyCourse.setSubHead("Environment Setup");
            keyCourse.setBody("There are several Pascal compilers and interpreters available for general use. Among\n" +
                    "these are:\n" +
                    "\uF0B7 Turbo Pascal: provides an IDE and compiler for running Pascal programs on\n" +
                    "CP/M, CP/M-86, DOS, Windows, and Macintosh.\n" +
                    "\uF0B7 Delphi: provides compilers for running Object Pascal and generates native\n" +
                    "code for 32- and 64-bit Windows operating systems, as well as 32-bit Mac OS\n" +
                    "X and iOS. Embarcadero is planning to build support for the Linux and Android\n" +
                    "operating system.\n" +
                    "\uF0B7 Free Pascal: it is a free compiler for running Pascal and Object Pascal\n" +
                    "programs. Free Pascal compiler is a 32- and 64-bit Turbo Pascal and Delphi\n" +
                    "compatible Pascal compiler for Linux, Windows, OS/2, FreeBSD, Mac OS X,\n" +
                    "DOS, and several other platforms.\n" +
                    "\uF0B7 Turbo51: it is a free Pascal compiler for the 8051 family of microcontrollers,\n" +
                    "with Turbo Pascal 7 syntax.\n" +
                    "\uF0B7 Oxygene: it is an Object Pascal compiler for the .NET and Mono platforms.\n" +
                    "\uF0B7 GNU Pascal (GPC): it is a Pascal compiler composed of a front end to GNU\n" +
                    "Compiler Collection.");
            courses.add(keyCourse);

            keyCourse = new KeyCourse();
            keyCourse.setId(6);
            keyCourse.setTitle("Pascal");
            keyCourse.setSubHead("Installing Pascal (Windows)");
            keyCourse.setBody("Installing Free Pascal on Windows\n" +
                    "For Windows, you will download the Windows installer, setup.exe. This is a usual\n" +
                    "installation program. You need to take the following steps for installation:\n" +
                    "\uF0B7 Select a directory.\n" +
                    "\uF0B7 Select parts of the package you want to install.\n" +
                    "\uF0B7 Optionally choose to associate the .pp or .pas extensions with the Free Pascal\n" +
                    "IDE.");
            courses.add(keyCourse);

            keyCourse = new KeyCourse();
            keyCourse.setId(7);
            keyCourse.setTitle("Pascal");
            keyCourse.setSubHead("Text Editor");
            keyCourse.setBody("This will be used to type your program. Examples of few editors include Windows\n" +
                    "Notepad, OS Edit command, Brief, Epsilon, EMACS, and vim or vi.\n" +
                    "Name and version of text editor can vary on different operating systems. For\n" +
                    "example, Notepad will be used on Windows and vim or vi can be used on windows as\n" +
                    "well as Linux or UNIX.\n" +
                    "The files you create with your editor are called source files and contain program\n" +
                    "source code. The source files for Pascal programs are typically named with the\n" +
                    "extension .pas.");
            courses.add(keyCourse);


            keyCourse = new KeyCourse();
            keyCourse.setId(8);
            keyCourse.setTitle("Pascal");
            keyCourse.setSubHead("Program Structure");
            keyCourse.setBody("Before we study basic building blocks of the Pascal programming language, let us\n" +
                    "look a bare minimum Pascal program structure so that we can take it as a reference\n" +
                    "in upcoming chapters.\n" +
                    "Pascal Program Structure\n" +
                    "A Pascal program basically consists of the following parts:\n" +
                    "\uF0B7 Program name\n" +
                    "\uF0B7 Uses command\n" +
                    "\uF0B7 Type declarations\n" +
                    "\uF0B7 Constant declarations\n" +
                    "\uF0B7 Variables declarations\n" +
                    "\uF0B7 Functions declarations\n" +
                    "\uF0B7 Procedures declarations\n" +
                    "\uF0B7 Main program block\n" +
                    "\uF0B7 Statements and Expressions within each block\n" +
                    "\uF0B7 Comments\n");
            courses.add(keyCourse);

            keyCourse = new KeyCourse();
            keyCourse.setId(9);
            keyCourse.setTitle("Pascal");
            keyCourse.setSubHead("Program Structure");
            keyCourse.setBody("Every Pascal program generally have a heading statement, a declaration and an\n" +
                    "execution part strictly in that order. Following format shows the basic syntax for a\n" +
                    "Pascal program:\n" +
                    "program {name of the program}\n" +
                    "uses {comma delimited names of libraries you use}\n" +
                    "const {global constant declaration block}\n" +
                    "var {global variable declaration block}\n" +
                    "Pascal\n" +
                    "12\n" +
                    "function {function declarations, if any}\n" +
                    "{ local variables }\n" +
                    "begin\n" +
                    "...\n" +
                    "end;\n" +
                    "procedure { procedure declarations, if any}\n" +
                    "{ local variables }\n" +
                    "begin\n" +
                    "...\n" +
                    "end;" +
                    "begin { main program block starts}\n" +
                    "...\n" +
                    "end. { the end of main program block }");
            courses.add(keyCourse);


            keyCourse = new KeyCourse();
            keyCourse.setId(10);
            keyCourse.setTitle("Pascal");
            keyCourse.setSubHead("Hello World Program");
            keyCourse.setBody("Following is a simple pascal code that would print the words \"Hello, World!\":\n" +
                    "program HelloWorld;\n" +
                    "uses crt;\n" +
                    "(* Here the main program block starts *)\n" +
                    "begin\n" +
                    " writeln('Hello, World!');\n" +
                    " readkey;\n" +
                    "end.\n" +
                    "Let us look various parts of the above program:\n" +
                    "\uF0B7 The first line of the program program HelloWorld; indicates the name of the\n" +
                    "program." +
                    "\uF0B7 The second line of the program uses crt; is a preprocessor command, which\n" +
                    "tells the compiler to include the crt unit before going to actual compilation.\n" +
                    "\uF0B7 The next lines enclosed within begin and end statements are the main program\n" +
                    "block. Every block in Pascal is enclosed within a begin statement and\n" +
                    "an end statement. However, the end statement indicating the end of the main\n" +
                    "program is followed by a full stop (.) instead of semicolon (;).\n" +
                    "\uF0B7 The begin statement of the main program block is where the program\n" +
                    "execution begins.\n" +
                    "\uF0B7 The lines within (*...*) will be ignored by the compiler and it has been put to\n" +
                    "add a comment in the program.\n" +
                    "\uF0B7 The statement writeln('Hello, World!'); uses the writeln function available in\n" +
                    "Pascal which causes the message \"Hello, World!\" to be displayed on the screen.\n" +
                    "\uF0B7 The statement readkey; allows the display to pause until the user presses a\n" +
                    "key. It is part of the crt unit. A unit is like a library in Pascal.\n" +
                    "\uF0B7 The last statement end. ends your program.\n");
            courses.add(keyCourse);


            keyCourse = new KeyCourse();
            keyCourse.setId(11);
            keyCourse.setTitle("Pascal");
            keyCourse.setSubHead("Basic Syntax");
            keyCourse.setBody("You have seen a basic structure of pascal program, so it will be easy to understand\n" +
                    "other basic building blocks of the pascal programming language.\n" +
                    "Variable\n" +
                    "A variable definition is put in a block beginning with a var keyword, followed by\n" +
                    "definitions of the variables as follows:\n" +
                    "var\n" +
                    "A_Variable, B_Variable ... : Variable_Type;\n" +
                    "Pascal variables are declared outside the code-body of the function which means they\n" +
                    "are not declared within the begin and end pairs, but they are declared after the\n" +
                    "definition of the procedure/function and before the begin keyword. For global\n" +
                    "variables, they are defined after the program header");
            courses.add(keyCourse);


            // Cpp
            keyCourse = new KeyCourse();
            keyCourse.setId(1);
            keyCourse.setTitle("Cpp");
            keyCourse.setSubHead("Introduction");
            keyCourse.setBody("C++ is a statically typed, compiled, general-purpose, case-sensitive, free-form programming\n" +
                    "language that supports procedural, object-oriented, and generic programming.\n" +
                    "C++ is regarded as a middle-level language, as it comprises a combination of both highlevel and low-level language features.\n" +
                    "C++ was developed by Bjarne Stroustrup starting in 1979 at Bell Labs in Murray Hill, New\n" +
                    "Jersey, as an enhancement to the C language and originally named C with Classes but later\n" +
                    "it was renamed C++ in 1983.\n" +
                    "C++ is a superset of C, and that virtually any legal C program is a legal C++ program.\n" +
                    "Note: A programming language is said to use static typing when type checking is performed\n" +
                    "during compile-time as opposed to run-time.\n");
            courses.add(keyCourse);

            keyCourse = new KeyCourse();
            keyCourse.setId(2);
            keyCourse.setTitle("Cpp");
            keyCourse.setSubHead("OOP");
            keyCourse.setBody("C++ fully supports object-oriented programming, including the four pillars of object-oriented\n" +
                    "development:\n" +
                    "\uF0B7 Encapsulation\n" +
                    "\uF0B7 Data hiding\n" +
                    "\uF0B7 Inheritance\n" +
                    "\uF0B7 Polymorphism");
            courses.add(keyCourse);

            keyCourse = new KeyCourse();
            keyCourse.setId(3);
            keyCourse.setTitle("Cpp");
            keyCourse.setSubHead("Standard Libraries");
            keyCourse.setBody("Standard C++ consists of three important parts:\n" +
                    "\uF0B7 The core language giving all the building blocks including variables, data types and\n" +
                    "literals, etc.\n" +
                    "\uF0B7 The C++ Standard Library giving a rich set of functions manipulating files, strings, etc.\n" +
                    "\uF0B7 The Standard Template Library (STL) giving a rich set of methods manipulating data\n" +
                    "structures, etc.");
            courses.add(keyCourse);


            keyCourse = new KeyCourse();
            keyCourse.setId(3);
            keyCourse.setTitle("Cpp");
            keyCourse.setSubHead("The ANSI Standard");
            keyCourse.setBody("The ANSI standard is an attempt to ensure that C++ is portable; that code you write for\n" +
                    "Microsoft's compiler will compile without errors, using a compiler on a Mac, UNIX, a Windows\n" +
                    "box, or an Alpha.\n" +
                    "The ANSI standard has been stable for a while, and all the major C++ compiler manufacturers\n" +
                    "support the ANSI standard.");
            courses.add(keyCourse);

            keyCourse = new KeyCourse();
            keyCourse.setId(4);
            keyCourse.setTitle("Cpp");
            keyCourse.setSubHead("Learning C++");
            keyCourse.setBody("The most important thing while learning C++ is to focus on concepts.\n" +
                    "The purpose of learning a programming language is to become a better programmer; that is,\n" +
                    "to become more effective at designing and implementing new systems and at maintaining old\n" +
                    "ones.\n" +
                    "C++ supports a variety of programming styles. You can write in the style of Fortran, C,\n" +
                    "Smalltalk, etc., in any language. Each style can achieve its aims effectively while maintaining\n" +
                    "runtime and space efficiency.\n" +
                    "Use of C++\n" +
                    "C++ is used by hundreds of thousands of programmers in essentially every application\n" +
                    "domain.\n" +
                    "C++ is being highly used to write device drivers and other software that rely on direct\n" +
                    "manipulation of hardware under real-time constraints.\n" +
                    "C++ is widely used for teaching and research because it is clean enough for successful\n" +
                    "teaching of basic concepts.\n" +
                    "Anyone who has used either an Apple Macintosh or a PC running Windows has indirectly used\n" +
                    "C++ because the primary user interfaces of these systems are written in C++.");
            courses.add(keyCourse);


            keyCourse = new KeyCourse();
            keyCourse.setId(4);
            keyCourse.setTitle("Cpp");
            keyCourse.setSubHead("Text Editor");
            keyCourse.setBody("This will be used to type your program. Examples of few editors include Windows Notepad,\n" +
                    "OS Edit command, Brief, Epsilon, EMACS, and vim or vi.\n" +
                    "Name and version of text editor can vary on different operating systems. For example,\n" +
                    "Notepad will be used on Windows and vim or vi can be used on windows as well as Linux, or\n" +
                    "UNIX.\n" +
                    "The files you create with your editor are called source files and for C++ they typically are\n" +
                    "named with the extension .cpp, .cp, or .c.\n" +
                    "A text editor should be in place to start your C++ programming.");
            courses.add(keyCourse);

            keyCourse = new KeyCourse();
            keyCourse.setId(5);
            keyCourse.setTitle("Cpp");
            keyCourse.setSubHead("Compiler");
            keyCourse.setBody("This is an actual C++ compiler, which will be used to compile your source code into final\n" +
                    "executable program.\n" +
                    "Most C++ compilers don't care what extension you give to your source code, but if you don't\n" +
                    "specify otherwise, many will use .cpp by default.\n" +
                    "Most frequently used and free available compiler is GNU C/C++ compiler, otherwise you can\n" +
                    "have compilers either from HP or Solaris if you have the respective Operating Systems.");
            courses.add(keyCourse);

            keyCourse = new KeyCourse();
            keyCourse.setId(6);
            keyCourse.setTitle("Cpp");
            keyCourse.setSubHead("Compiler Installation");
            keyCourse.setBody("To install GCC at Windows you need to install MinGW. To install MinGW, go to the MinGW\n" +
                    "homepage, www.mingw.org, and follow the link to the MinGW download page. Download the \n" +
                    "C++\n" +
                    "14\n" +
                    "latest version of the MinGW installation program which should be named MinGW-\n" +
                    "<version>.exe.\n" +
                    "While installing MinGW, at a minimum, you must install gcc-core, gcc-g++, binutils, and the\n" +
                    "MinGW runtime, but you may wish to install more.\n" +
                    "Add the bin subdirectory of your MinGW installation to your PATH environment variable so\n" +
                    "that you can specify these tools on the command line by their simple names.\n" +
                    "When the installation is complete, you will be able to run gcc, g++, ar, ranlib, dlltool, and\n" +
                    "several other GNU tools from the Windows command line.");
            courses.add(keyCourse);

            keyCourse = new KeyCourse();
            keyCourse.setId(7);
            keyCourse.setTitle("Cpp");
            keyCourse.setSubHead("Basic Syntax");
            keyCourse.setBody("When we consider a C++ program, it can be defined as a collection of objects that\n" +
                    "communicate via invoking each other's methods. Let us now briefly look into what a class,\n" +
                    "object, methods, and instant variables mean.\n" +
                    "\uF0B7 Object - Objects have states and behaviors. Example: A dog has states - color, name,\n" +
                    "breed as well as behaviors - wagging, barking, and eating. An object is an instance of\n" +
                    "a class.\n" +
                    "\uF0B7 Class - A class can be defined as a template/blueprint that describes the\n" +
                    "behaviors/states that object of its type support.\n" +
                    "\uF0B7 Methods - A method is basically a behavior. A class can contain many methods. It is\n" +
                    "in methods where the logics are written, data is manipulated and all the actions are\n" +
                    "executed.\n" +
                    "\uF0B7 Instant Variables - Each object has its unique set of instant variables. An object's\n" +
                    "state is created by the values assigned to these instant variables.");
            courses.add(keyCourse);

            keyCourse = new KeyCourse();
            keyCourse.setId(8);
            keyCourse.setTitle("Cpp");
            keyCourse.setSubHead("Program Structure");
            keyCourse.setBody("Let us look at a simple code that would print the words Hello World.\n" +
                    "#include <iostream>\n" +
                    "using namespace std;\n" +
                    "// main() is where program execution begins.\n" +
                    "int main()\n" +
                    "{\n" +
                    " cout << \"Hello World\"; // prints Hello World\n" +
                    " return 0;\n" +
                    "}\n" +
                    "Let us look at the various parts of the above program:\n" +
                    "1. The C++ language defines several headers, which contain information that is either\n" +
                    "necessary or useful to your program. For this program, the header <iostream> is\n" +
                    "needed." +
                    "2. The line using namespace std; tells the compiler to use the std namespace.\n" +
                    "Namespaces are a relatively recent addition to C++.\n" +
                    "3. The next line ‘// main() is where program execution begins.’ is a single-line\n" +
                    "comment available in C++. Single-line comments begin with // and stop at the end of\n" +
                    "the line.\n" +
                    "4. The line int main() is the main function where program execution begins.\n" +
                    "5. The next line cout << \"This is my first C++ program.\"; causes the message \"This\n" +
                    "is my first C++ program\" to be displayed on the screen.\n" +
                    "6. The next line return 0; terminates main() function and causes it to return the value 0\n" +
                    "to the calling process.");
            courses.add(keyCourse);

            keyCourse = new KeyCourse();
            keyCourse.setId(9);
            keyCourse.setTitle("Cpp");
            keyCourse.setSubHead("C++ Keywords");
            keyCourse.setBody("The following list shows the reserved words in C++. These reserved words may not be used\n" +
                    "as constant or variable or any other identifier names." +
                    "asm else new this\n" +
                    "auto enum operator throw\n" +
                    "bool explicit private true\n" +
                    "break export protected try\n" +
                    "case extern public typedef\n" +
                    "catch false register typeid\n" +
                    "char float reinterpret_cast typename\n" +
                    "class for return union\n" +
                    "const friend short unsigned\n" +
                    "const_cast goto signed using\n" +
                    "continue if sizeof virtual\n" +
                    "default inline static void\n" +
                    "delete int static_cast volatile\n" +
                    "do long struct wchar_t\n" +
                    "double mutable switch while\n" +
                    "dynamic_cast namespace template");
            courses.add(keyCourse);

            keyCourse = new KeyCourse();
            keyCourse.setId(10);
            keyCourse.setTitle("Cpp");
            keyCourse.setSubHead("C++ Data Types");
            keyCourse.setBody("While writing program in any language, you need to use various variables to store various\n" +
                    "information. Variables are nothing but reserved memory locations to store values. This means\n" +
                    "that when you create a variable you reserve some space in memory.\n" +
                    "You may like to store information of various data types like character, wide character, integer,\n" +
                    "floating point, double floating point, boolean etc. Based on the data type of a variable, the\n" +
                    "operating system allocates memory and decides what can be stored in the reserved memory." +
                    "C++ offers the programmer a rich assortment of built-in as well as user defined data types.\n" +
                    "Following table lists down seven basic C++ data types:\n" +
                    "Type Keyword\n" +
                    "Boolean bool\n" +
                    "Character char\n" +
                    "Integer int\n" +
                    "Floating point float\n" +
                    "Double floating point double\n" +
                    "Valueless void\n" +
                    "Wide character wchar_t");
            courses.add(keyCourse);


            // Python
            keyCourse = new KeyCourse();
            keyCourse.setId(1);
            keyCourse.setTitle("Python");
            keyCourse.setSubHead("Introduction");
            keyCourse.setBody("Python is a high-level, interpreted, interactive and object-oriented scripting language. Python\n" +
                    "is designed to be highly readable. It uses English keywords frequently where as other\n" +
                    "languages use punctuation, and it has fewer syntactical constructions than other languages.\n" +
                    "\uF0B7 Python is Interpreted: Python is processed at runtime by the interpreter. You do not\n" +
                    "need to compile your program before executing it. This is similar to PERL and PHP.\n" +
                    "\uF0B7 Python is Interactive: You can actually sit at a Python prompt and interact with the\n" +
                    "interpreter directly to write your programs.\n" +
                    "\uF0B7 Python is Object-Oriented: Python supports Object-Oriented style or technique of\n" +
                    "programming that encapsulates code within objects.\n" +
                    "\uF0B7 Python is a Beginner's Language: Python is a great language for the beginner-level\n" +
                    "programmers and supports the development of a wide range of applications from\n" +
                    "simple text processing to WWW browsers to games.");
            courses.add(keyCourse);


            keyCourse = new KeyCourse();
            keyCourse.setId(2);
            keyCourse.setTitle("Python");
            keyCourse.setSubHead("History");
            keyCourse.setBody("Python was developed by Guido van Rossum in the late eighties and early nineties at the\n" +
                    "National Research Institute for Mathematics and Computer Science in the Netherlands.\n" +
                    "Python is derived from many other languages, including ABC, Modula-3, C, C++, Algol-68,\n" +
                    "SmallTalk, Unix shell, and other scripting languages.\n" +
                    "Python is copyrighted. Like Perl, Python source code is now available under the GNU General\n" +
                    "Public License (GPL).\n" +
                    "Python is now maintained by a core development team at the institute, although Guido van\n" +
                    "Rossum still holds a vital role in directing its progress.");
            courses.add(keyCourse);

            keyCourse = new KeyCourse();
            keyCourse.setId(3);
            keyCourse.setTitle("Python");
            keyCourse.setSubHead("Features");
            keyCourse.setBody("Python's features include:\n" +
                    "\uF0B7 Easy-to-learn: Python has few keywords, simple structure, and a clearly defined\n" +
                    "syntax. This allows the student to pick up the language quickly.\n" +
                    "\uF0B7 Easy-to-read: Python code is more clearly defined and visible to the eyes.\n" +
                    "\uF0B7 Easy-to-maintain: Python's source code is fairly easy-to-maintain.\n" +
                    "\uF0B7 A broad standard library: Python's bulk of the library is very portable and crossplatform compatible on UNIX, Windows, and Macintosh.\n" +
                    "\uF0B7 Interactive Mode: Python has support for an interactive mode which allows\n" +
                    "interactive testing and debugging of snippets of code." +
                    "\uF0B7 Portable: Python can run on a wide variety of hardware platforms and has the same\n" +
                    "interface on all platforms.\n" +
                    "\uF0B7 Extendable: You can add low-level modules to the Python interpreter. These modules\n" +
                    "enable programmers to add to or customize their tools to be more efficient.\n" +
                    "\uF0B7 Databases: Python provides interfaces to all major commercial databases.\n" +
                    "\uF0B7 GUI Programming: Python supports GUI applications that can be created and ported\n" +
                    "to many system calls, libraries, and windows systems, such as Windows MFC,\n" +
                    "Macintosh, and the X Window system of Unix.\n" +
                    "\uF0B7 Scalable: Python provides a better structure and support for large programs than shell\n" +
                    "scripting.");
            courses.add(keyCourse);

            keyCourse = new KeyCourse();
            keyCourse.setId(4);
            keyCourse.setTitle("Python");
            keyCourse.setSubHead("Setup");
            keyCourse.setBody("Python is available on a wide variety of platforms including Linux and Mac OS X. Let's\n" +
                    "understand how to set up our Python environment.\n" +
                    "Local Environment Setup\n" +
                    "Open a terminal window and type \"python\" to find out if it is already installed and which\n" +
                    "version is installed.\n" +
                    "\uF0B7 Unix (Solaris, Linux, FreeBSD, AIX, HP/UX, SunOS, IRIX, etc.)\n" +
                    "\uF0B7 Win 9x/NT/2000\n" +
                    "\uF0B7 Macintosh (Intel, PPC, 68K)\n" +
                    "\uF0B7 OS/2\n" +
                    "\uF0B7 DOS (multiple versions)\n" +
                    "\uF0B7 PalmOS\n" +
                    "\uF0B7 Nokia mobile phones\n" +
                    "\uF0B7 Windows CE\n" +
                    "\uF0B7 Acorn/RISC OS\n" +
                    "\uF0B7 BeOS\n" +
                    "\uF0B7 Amiga\n" +
                    "\uF0B7 VMS/OpenVMS\n" +
                    "\uF0B7 QNX\n" +
                    "\uF0B7 VxWorks\n" +
                    "\uF0B7 Psion\n" +
                    "\uF0B7 Python has also been ported to the Java and .NET virtual machines");
            courses.add(keyCourse);

            keyCourse = new KeyCourse();
            keyCourse.setId(5);
            keyCourse.setTitle("Python");
            keyCourse.setSubHead("Installation");
            keyCourse.setBody("Here are the steps to install Python on Windows machine.\n" +
                    "\uF0B7 Open a Web browser and go to http://www.python.org/download/\n" +
                    "\uF0B7 Follow the link for the Windows installer python-XYZ.msi file where XYZ is the version\n" +
                    "you need to install.\n" +
                    "\uF0B7 To use this installer python-XYZ.msi, the Windows system must support Microsoft\n" +
                    "Installer 2.0. Save the installer file to your local machine and then run it to find out if\n" +
                    "your machine supports MSI.\n" +
                    "\uF0B7 Run the downloaded file. This brings up the Python install wizard, which is really easy\n" +
                    "to use. Just accept the default settings, wait until the install is finished, and you are\n" +
                    "done.");
            courses.add(keyCourse);

            keyCourse = new KeyCourse();
            keyCourse.setId(6);
            keyCourse.setTitle("Python");
            keyCourse.setSubHead("Installation");
            keyCourse.setBody("Here are the steps to install Python on Windows machine.\n" +
                    "\uF0B7 Open a Web browser and go to http://www.python.org/download/\n" +
                    "\uF0B7 Follow the link for the Windows installer python-XYZ.msi file where XYZ is the version\n" +
                    "you need to install.\n" +
                    "\uF0B7 To use this installer python-XYZ.msi, the Windows system must support Microsoft\n" +
                    "Installer 2.0. Save the installer file to your local machine and then run it to find out if\n" +
                    "your machine supports MSI.\n" +
                    "\uF0B7 Run the downloaded file. This brings up the Python install wizard, which is really easy\n" +
                    "to use. Just accept the default settings, wait until the install is finished, and you are\n" +
                    "done.");
            courses.add(keyCourse);

            keyCourse = new KeyCourse();
            keyCourse.setId(7);
            keyCourse.setTitle("Python");
            keyCourse.setSubHead("Variables");
            keyCourse.setBody("Variables are containers for storing data values.\n" +
                    "Unlike other programming languages, Python has no command for declaring a variable.\n" +
                    "A variable is created the moment you first assign a value to it.");
            courses.add(keyCourse);

            keyCourse = new KeyCourse();
            keyCourse.setId(7);
            keyCourse.setTitle("Python");
            keyCourse.setSubHead("Data Types");
            keyCourse.setBody("In programming, data type is an important concept.\n" +
                    "\n" +
                    "Variables can store data of different types, and different types can do different things.\n" +
                    "\n" +
                    "Python has the following data types built-in by default, in these categories:\n" +
                    "\n" +
                    "Text Type:\tstr\n" +
                    "Numeric Types:\tint, float, complex\n" +
                    "Sequence Types:\tlist, tuple, range\n" +
                    "Mapping Type:\tdict\n" +
                    "Set Types:\tset, frozenset\n" +
                    "Boolean Type:\tbool\n" +
                    "Binary Types:\tbytes, bytearray, memoryview.");
            courses.add(keyCourse);

            keyCourse = new KeyCourse();
            keyCourse.setId(8);
            keyCourse.setTitle("Python");
            keyCourse.setSubHead("If...Else");
            keyCourse.setBody("Python supports the usual logical conditions from mathematics:\n" +
                    "\n" +
                    "Equals: a == b\n" +
                    "Not Equals: a != b\n" +
                    "Less than: a < b\n" +
                    "Less than or equal to: a <= b\n" +
                    "Greater than: a > b\n" +
                    "Greater than or equal to: a >= b\n" +
                    "These conditions can be used in several ways, most commonly in \"if statements\" and loops.\n" +
                    "\n" +
                    "An \"if statement\" is written by using the if keyword.");
            courses.add(keyCourse);

            keyCourse = new KeyCourse();
            keyCourse.setId(9);
            keyCourse.setTitle("Python");
            keyCourse.setSubHead("Functions");
            keyCourse.setBody("A function is a block of code which only runs when it is called.\n" +
                    "\n" +
                    "You can pass data, known as parameters, into a function.\n" +
                    "\n" +
                    "A function can return data as a result.\n" +
                    "\n" +
                    "Creating a Function\n" +
                    "In Python a function is defined using the def keyword:");
            courses.add(keyCourse);

            keyCourse = new KeyCourse();
            keyCourse.setId(10);
            keyCourse.setTitle("Python");
            keyCourse.setSubHead("Module");
            keyCourse.setBody("Consider a module to be the same as a code library.\n" +
                    "\n" +
                    "A file containing a set of functions you want to include in your application.\n" +
                    "\n" +
                    "Create a Module\n" +
                    "To create a module just save the code you want in a file with the file extension .py:" +
                    "def greeting(name):\n" +
                    "  print(\"Hello, \" + name)");
            courses.add(keyCourse);
        }

        return courses;
    }

    public static List<KeyCourse> getKeyPoints(String title) {
        List<KeyCourse> courseList = new ArrayList<>();

        for (KeyCourse kc: getCourses()) {
            if (kc.getTitle().equalsIgnoreCase(title)) {
                courseList.add(kc);
            }
        }

        return courseList;
    }

    public static KeyCourse getCourse(int id, String title) {

        List<KeyCourse> keyCourses = getCourses();

        if (keyCourses != null)  {

            for (KeyCourse course: keyCourses) {
                if (course.getTitle().equalsIgnoreCase(title) && course.getId() == id) {
                    keyCourse = course;
                }
            }
        }

        return keyCourse;
    }
}
