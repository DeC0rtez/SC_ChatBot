# Clojure ChatBot
## Background
* A group project for the 2004 Symbolic Computation class instructed by Petr Švarný at Prague College. Project technical report available on [Github Page](https://dec0rtez.github.io/SC_ChatBot/).
## Objective
* To create a basic ChatBot able to converse with the user about the various parks in Prague. The chatbot is written in Clojure in a way which allows it to be adapted and expanded upon according to progressively more demanding requirements.

## Requirements
* Working Clojure REPL on system
* Alternatively access to an online REPL such as [repl.it](https://repl.it/)

## Installation
* No installation required. 
* All features of the code can be used directly from a .clj file in a REPL.
* NOTE: the code was written and tested on Clojure vesion 1.8.0. The "clojure.string/includes?" functionality can be unavailable in older versions of Clojure.

## Usage
* To start the chatbot in REPL, run the chatbot_v1.clj file and type: (chatbot) to run the function.
* Once the chatbot has taken your name and you have selected a park to ask questions about, you can ask questions about the selected park. The ChatBot will check the input, identify what the user is asking about and generate a coherent response. 
* To end the conversation with the chatbot by typing one of the following words: end, stop, bye, goodbye and farewell. (works only after username and park have been chosen.)

## Support
* If you wish to make suggestions about the chatbot directly to the creators, ask for assistance or get involved in the project, please reach out to us on [discord](https://discord.gg/XRJ2GbMf).

## License
* MIT LICENSE

Copyright (c) 2020 SC_ChatBot

Permission is hereby granted, free of charge, to any person obtaining a copy
of this software and associated documentation files (the "Software"), to deal
in the Software without restriction, including without limitation the rights
to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
copies of the Software, and to permit persons to whom the Software is
furnished to do so, subject to the following conditions:

The above copyright notice and this permission notice shall be included in all
copies or substantial portions of the Software.

THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE
SOFTWARE.

## CHANGELOG
* 8th December, 2020 - Initial release, v1.

## KNOWN ISSUES 
* missing park vojanovy sady
* slight issues with multi word string keyword recognition and category assigning
* no apparent separation of user and bot messages

## Contributors
- [Daniel De Corte](https://github.com/DeC0rtez)
- [Artem Pyatigorov](https://github.com/Lucius1010011010)
- [Vladyslav Koskovetskyi](https://github.com/Vladyslav48)
- [Nikita Druzhkov](https://github.com/ndr-power)

## Supervisor
- [Petr Švarný](https://github.com/svarnypetr)
