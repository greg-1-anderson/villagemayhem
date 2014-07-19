About
-----

Village Mayhem is a scratch project created to experiment with Google's
PlayN game framework.  We set up the initial project using NetBeans using
the following guide:

http://www.gamefromscratch.com/post/2012/05/24/Using-Netbeans-712-with-PlayN-13.aspx

Previous attempts to use the more-commonly-documented Eclipse setup were
not successful.


Getting Started
---------------

Create a new project:

File → New project → Search: “playn” → playn-architype → Next

Project Name: villagemayhem
Group ID:  com.reetstreet
Package name: com.reetstreet.villagemayhem
JavaGameClassName: VillageMayhemGame

Build the metaproject:

VilliageMayhemGame Metaproject → Clean and Build

Run the java project:

VillageMayhemGame Java → Run

Select main class:  com.reetstreet.villiagemayhem.java.VillageMahyemGameJava

Victory!  Empty playn window opens.  Much easier than Eclipse.

Initial commit:

ecac1a1 2014-07-04 Initial project: VillageMayhem generated from playn maven artifact.


Add a Simple Menu
-----------------

Add the "tripple play" PlayN user interface library, and use it to build
a simple menu with clickable buttons.  For this demo, we put the model
(amount of gold) directly in the main game class.

9f3edef 2014-07-04 Add a simple control that shows how much gold is in the game

Then, Byron clones the "gold" counter and makes a similar "light magic" counter.

a57b115 2014-07-04 duplicate gold label and clink button to make a light magic label 

Next up: factor model out of game class.
