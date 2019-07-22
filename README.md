# WebCrawler


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
