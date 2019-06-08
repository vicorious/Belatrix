# Belatrix exercise


1. Is a jar stand-alone (Without frameworks)
2. Supports Java 1.8


## Test cases

- For execute the jar, you need know:

- **/Users/digital/Documents/java_belatrix/urls.txt HASH #ff /Users/digital/Documents/java_belatrix** 
## First param

#### URL file (In example is *"/Users/digital/Documents/java_belatrix/urls.txt")
  - http://www.yahoo.com
  - http://www.cnn.com
  - http://news.google.com
  - http://www.huffingtonpost.com/
  - http://www.nytimes.com/
  - http://www.nbcnews.com/
  - http://www.foxnews.com/
  - http://ww.boston.com/
  - http://www.theguardian.com/us
  - http://www.usatoday.com/
  - http://www.washingtonpost.com/
  - http://www.bbc.co.uk/news/
  - http://abcnews.go.com/
  - http://www.latimes.com/
  - http://www.cbsnews.com/
  - http://www.reuters.com
  - http://www.rollingstones.com/
  - http://news.cnet.com/
  - http://www.zdnet.com/
  - http://www.extremetech.com/
  - http://www.technewsworld.com/
  
## Second param (In example is *"HASH")

  * Second you need send a ARG PARAM. this arg param will be:
    *. **HASH**
    *. **TWITTER**
    *. **ANY**
## Third param (In example is *"#ff")

  * Third param is the matcher
    *. **HASH** (*#anything)
    *. **TWITTER** (@account)
    *. **ANY** (anythingelse)
    
## Four param (In example is *"/Users/digital/Documents/java_belatrix")

  * Four param is the outpath (**ONLY PATH, NO INCLUCED Files name*)
    - /My/Relative/or/Absolute/Output/Path
    

# Results

> ![Invitame una cerveza](/assets/result1.png)

* HTML folder will have ALL html index for each page from URL file

> ![Invitame una cerveza](/assets/result2.png)

* All Files result with ARG Param name.

* example:
  - CNN_TWITTER_FINAL.txt -> In this file you find all last Twitter account in cnn index
  - CNN_HASH_FINAL.txt -> In this file you find all last Hash account in cnn index
  - CNN_BELATRIX_FINAL -> In this file you find all last BELATRIX word in cnn index


 ## And the final log in console
 
Directory already exists
Request URL ... http://www.yahoo.com
Response Code ... 301
Redirect to URL : https://www.yahoo.com/
Done
Request URL ... http://www.cnn.com
Response Code ... 301
Redirect to URL : https://www.cnn.com/
Done
Request URL ... http://news.google.com
Response Code ... 301
Redirect to URL : https://news.google.com/
Done
Request URL ... http://www.nytimes.com/
Response Code ... 301
Redirect to URL : https://www.nytimes.com/
Done
Request URL ... http://www.nbcnews.com/
Response Code ... 301
Redirect to URL : https://www.nbcnews.com/
Done
Request URL ... http://www.foxnews.com/
Response Code ... 301
Redirect to URL : https://www.foxnews.com/
Done
Request URL ... http://www.boston.com/
Response Code ... 301
Redirect to URL : https://www.boston.com/
Done
Request URL ... http://www.theguardian.com/us
Response Code ... 301
Redirect to URL : https://www.theguardian.com/us
Done
Request URL ... http://www.usatoday.com/
Response Code ... 301
Redirect to URL : https://www.usatoday.com/
Done
Request URL ... http://www.washingtonpost.com/
Response Code ... 301
Redirect to URL : https://www.washingtonpost.com/
Done
Request URL ... http://www.bbc.co.uk/news/
Response Code ... 301
Redirect to URL : https://www.bbc.co.uk/news
Done
Request URL ... http://abcnews.go.com/
Response Code ... 301
Redirect to URL : https://abcnews.go.com/
Done
Request URL ... http://www.latimes.com/
Response Code ... 301
Redirect to URL : https://www.latimes.com/
Done
Request URL ... http://www.cbsnews.com/
Response Code ... 301
Redirect to URL : https://www.cbsnews.com/
Done
Request URL ... http://www.reuters.com/
Response Code ... 301
Redirect to URL : https://www.reuters.com/
Done
Request URL ... http://www.rollingstones.com/
Response Code ... 200
Done
Request URL ... http://news.cnet.com/
Response Code ... 301
Redirect to URL : https://www.cnet.com/news/
Done
Request URL ... http://www.zdnet.com/
Response Code ... 301
Redirect to URL : https://www.zdnet.com/
Done
Request URL ... http://www.extremetech.com/
Response Code ... 301
Redirect to URL : https://www.extremetech.com:443/
Done
Request URL ... http://www.technewsworld.com/
Response Code ... 301
Redirect to URL : https://www.technewsworld.com/
Done
Finish!
