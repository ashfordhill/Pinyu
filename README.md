# Pinyu
This app currently functions like a pocket dictionary. It contains a little over 50 Chinese words spanning different categories.

Pinyu is my first attempt to try and utilize less-naive design practices. I attempt to follow the MVP pattern here
for my vocab review screens. I'm also utilizing inheritence for the different activitity classes and some static
variables and methods to help with organization and navigation.

<p align="center"> <img src="https://github.com/ashfordhill/LearnChinese/blob/master/screenshots/mainmenu.png" width="300">
<img src="https://github.com/ashfordhill/LearnChinese/blob/master/screenshots/animalsscreen.png" width="300"></p>

# How it works
Pinyu gets its words from an SQLite database that contains the english word, pinyin, chinese character, category of the word,
and the sound and image resource IDs. 

The Content Provider (WordProvider.java) is defined in AndroidManifest.xml file. This Provider is accessed by
the Content Loader in the Vocab Activity parent class. The Loader uses a URI to access the Provider and query
different categories to display for each activity. This data is loaded into a custom adapter that contains all the 
necessary information for the words and the sound play buttons.

Improvements to this app would include using Fragments over Activities for the vocabulary review screens, as well as potentially
using a Navigation Architecture Component to handle different fragment navigations. 

# Acknowledgements
A big thanks to Yu Qi for recording the sound clips in Mandarin, as well as 
<a href="https://www.flaticon.com/authors/roundicons">Roundicons</a> and <a href="https://www.flaticon.com/authors/Freepik">Freepik</a>
from www.flations.com for all of the icons.