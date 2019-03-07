package json.parser;

import sun.plugin2.message.GetAppletMessage;

public class CnnAPI {

}
    /*
      You can get API_KEY from this below link. Once you have the API_KEY, you can fetch the top-headlines news.
      https://newsapi.org/s/cnn-api

      Fetch This following CNN API, It will return some news in Json data. Parse this data and construct
      https://newsapi.org/v2/top-headlines?sources=cnn&apiKey=6fe7be7648f2462798caa28e44c319bb

      MY_API_KEY=0d9e35dfa3c140aab8bf9cdd70df957f

      After getting Json Format of the news, You can go to json validator link: https://jsonlint.com/ to see
      how it can be parsed.

    {
	"status": "ok",
	"totalResults": 10,
	"articles": [{
		"source": {
			"id": "cnn",
			"name": "CNN"
		},
		"author": null,
		"title": "Democratic voters: Biden should stay out of 2020 race - CNN Video",
		"description": "CNN's Alisyn Camerota asks a panel of six Democrats what they think about the 2020 race.",
		"url": "http://us.cnn.com/videos/politics/2019/03/05/democrat-voter-panel-biden-2020-camerota-newday-vpx.cnn",
		"urlToImage": "https://cdn.cnn.com/cnnnext/dam/assets/190305104212-democrat-voter-panel-new-day-super-tease.jpg",
		"publishedAt": "2019-03-06T20:09:10.514455Z",
		"content": "Chat with us in Facebook Messenger. Find out what's happening in the world as it unfolds."
	}, {
		"source": {
			"id": "cnn",
			"name": "CNN"
		},
		"author": null,
		"title": "Santorum: Trump won't refuse to leave office if he loses - CNN Video",
		"description": "Former Senator Rick Santorum says he does not think President Trump would resist leaving office if he lost the presidential election in 2020.",
		"url": "http://us.cnn.com/videos/politics/2019/03/05/santorum-trump-2020-election-result-response-crn-vpx.cnn",
		"urlToImage": "https://cdn.cnn.com/cnnnext/dam/assets/190305140300-santorum-trump-2020-election-result-resposne-crn-vpx-00000000-super-tease.jpg",
		"publishedAt": "2019-03-06T20:08:57.717614Z",
		"content": "Chat with us in Facebook Messenger. Find out what's happening in the world as it unfolds."
	}, {
		"source": {
			"id": "cnn",
			"name": "CNN"
		},
		"author": "Elizabeth Landers, CNN",
		"title": "Freshman GOP senator reveals she was sexually assaulted when she served in the military",
		"description": "Freshman Sen. Martha McSally of Arizona revealed Wednesday that she was raped while she served in the military.",
		"url": "http://us.cnn.com/2019/03/06/politics/martha-mcsally-rape-sexual-assault-survivor/index.html",
		"urlToImage": "https://cdn.cnn.com/cnnnext/dam/assets/180829001841-04-martha-mcsally-0828-primary-victory-super-tease.jpg",
		"publishedAt": "2019-03-06T19:57:48Z",
		"content": null
	}, {
		"source": {
			"id": "cnn",
			"name": "CNN"
		},
		"author": "Analysis by Chris Cillizza, CNN Editor-at-large",
		"title": "Hillary Clinton is OUT of the 2020 race. (Or is she?)",
		"description": "On Monday, Hillary Clinton ruled out -- once and for all -- running for president for a third time in 2020.",
		"url": "http://us.cnn.com/2019/03/06/politics/hillary-clinton-2020/index.html",
		"urlToImage": "https://cdn.cnn.com/cnnnext/dam/assets/170913115154-hillary-clinton-09-12-2017-super-tease.jpg",
		"publishedAt": "2019-03-06T19:45:25Z",
		"content": "THE POINT -- NOW ON YOUTUBE! \r\nIn each episode of his weekly YouTube show, Chris Cillizza will delve a little deeper into the surreal world of politics. Click to subscribe!"
	}, {
		"source": {
			"id": "cnn",
			"name": "CNN"
		},
		"author": "Lisa Respers France, CNN",
		"title": "What we learned from the R. Kelly interview Part 1",
		"description": "The first portion of Gayle King's exclusive interview with singer R. Kelly aired on \"CBS This Morning\" Wednesday and it was explosive.",
		"url": "http://us.cnn.com/2019/03/06/entertainment/r-kelly-what-we-learned/index.html",
		"urlToImage": "https://cdn.cnn.com/cnnnext/dam/assets/190306114230-01-r-kelly-gayle-king-interview-super-tease.jpg",
		"publishedAt": "2019-03-06T19:36:20Z",
		"content": "WATCH: @GayleKing spoke to Joycelyn Savage and Azriel Clary about living with R. Kelly and their estranged relationship with their families. It made them very emotional.\r\nWe'll bring you more of their interview, tomorrow only on @CBSThisMorning. pic.twitter.c… [+64 chars]"
	}, {
		"source": {
			"id": "cnn",
			"name": "CNN"
		},
		"author": "Brian Stelter, CNN Business",
		"title": "Democrats say they will not hold debates on Fox News",
		"description": "The Democrats will not be debating on Fox News this year.",
		"url": "http://us.cnn.com/2019/03/06/media/fox-news-democratic-debates/index.html",
		"urlToImage": "https://cdn.cnn.com/cnnnext/dam/assets/190306134047-dnc-fox-news-debates-super-tease.jpg",
		"publishedAt": "2019-03-06T19:01:18Z",
		"content": null
	}, {
		"source": {
			"id": "cnn",
			"name": "CNN"
		},
		"author": "Betsy Klein, CNN",
		"title": "What does Ivanka Trump do?",
		"description": "Ivanka Trump became a full-time adviser to the President in March 2017 after informally advising her father, Donald Trump, during the first two months of his administration.",
		"url": "http://us.cnn.com/2019/03/06/politics/ivanka-trump-security-clearance-white-house/index.html",
		"urlToImage": "https://cdn.cnn.com/cnnnext/dam/assets/190213112809-ivanka-trump-wilbur-ross-super-tease.jpg",
		"publishedAt": "2019-03-06T17:37:35Z",
		"content": "Washington (CNN)Ivanka Trump became a full-time adviser to the President in March 2017 after informally advising her father, Donald Trump, during the first two months of his administration. \r\nCritics point out her lack of government experience, but defenders … [+6569 chars]"
	}, {
		"source": {
			"id": "cnn",
			"name": "CNN"
		},
		"author": "Analysis by Chris Cillizza, CNN Editor-at-large",
		"title": "Donald Trump is laying the groundwork to de-legitimize the 2020 election",
		"description": "Even as the 2020 race begins in earnest, President Donald Trump is already suggesting that Democrats cannot beat him fairly -- raising the specter that if he loses next November, he will suggest that the election was not legitimate.",
		"url": "http://us.cnn.com/2019/03/06/politics/donald-trump-2020-election-illegitimate/index.html",
		"urlToImage": "https://cdn.cnn.com/cnnnext/dam/assets/190306094939-trump-03052019-super-tease.jpg",
		"publishedAt": "2019-03-06T17:05:53Z",
		"content": "THE POINT -- NOW ON YOUTUBE! \r\nIn each episode of his weekly YouTube show, Chris Cillizza will delve a little deeper into the surreal world of politics. Click to subscribe!"
	}, {
		"source": {
			"id": "cnn",
			"name": "CNN"
		},
		"author": "Clare Foran, CNN",
		"title": "Democratic lawmaker announces plans to file impeachment resolution",
		"description": "Democratic Rep. Rashida Tlaib plans to file soon an impeachment resolution against President Donald Trump, the freshmen Democratic lawmaker from Michigan announced at a news conference Wednesday.",
		"url": "http://us.cnn.com/2019/03/06/politics/rashida-tlaib-impeachment-resolution/index.html",
		"urlToImage": "https://cdn.cnn.com/cnnnext/dam/assets/190227165707-27-michael-cohen-house-hearing-0227-super-tease.jpg",
		"publishedAt": "2019-03-06T16:49:06Z",
		"content": "(CNN)Democratic Rep. Rashida Tlaib plans to file soon an impeachment resolution against President Donald Trump, the freshmen Democratic lawmaker from Michigan announced at a news conference Wednesday.\r\n\"Later on this month, I will be joining folks and advocat… [+4054 chars]"
	}, {
		"source": {
			"id": "cnn",
			"name": "CNN"
		},
		"author": "Analysis by Harry Enten, CNN",
		"title": "Early polling suggests 2020 will be about Trump. That's bad news for him.",
		"description": "President Donald Trump was able to win the White House in 2016 despite being the least liked major party nominee in history. Today, more people continue to dislike than like Trump.",
		"url": "http://us.cnn.com/2019/03/05/politics/2020-bad-news-trump/index.html",
		"urlToImage": "https://cdn.cnn.com/cnnnext/dam/assets/190305012913-0305-trump-photo-01-super-tease.jpg",
		"publishedAt": "2019-03-06T11:50:39Z",
		"content": null
	}]
}
      "articles": [{
		"source": {
			"id": "cnn",
			"name": "CNN"
		},
		"author": null,
		"title": "Who is affected by a shutdown? - CNN Video",
		"description": "CNN's Tom Foreman breaks down who is affected by a federal government partial shutdown.",
		"url": "http://us.cnn.com/videos/politics/2018/12/22/federal-partial-shutdown-by-the-numbers-foreman-ctn-vpx.cnn",
		"urlToImage": "https://cdn.cnn.com/cnnnext/dam/assets/181202171029-government-shutdown-capitol-file-super-tease.jpg",
		"publishedAt": "2018-12-23T01:09:50.8583193Z",
		"content": "Chat with us in Facebook Messenger. Find out what's happening in the world as it unfolds."
	   },{}]

	   Read the articles array and construct Headline news as source, author, title,description,url,urlToImage,publishedAt
	   and content. You need to design News Data Model and construct headline news.
	   You can store in Map and then into ArrayList as your choice of Data Structure.

	   You can follow How we implemented in Employee and JsonReaderUtil task.

	   Show output of all the headline news in to console.
	   Store into choice of your database and retrieve.

     */

/*
}
        {
                "status": "ok",
                "totalResults": 10,
                "articles": [{
                "source": {
                "id": "cnn",
                "name": "CNN"
                },
                "author": null,
                "title": "Democratic voters: Biden should stay out of 2020 race - CNN Video",
                "description": "CNN's Alisyn Camerota asks a panel of six Democrats what they think about the 2020 race.",
                "url": "http://us.cnn.com/videos/politics/2019/03/05/democrat-voter-panel-biden-2020-camerota-newday-vpx.cnn",
                "urlToImage": "https://cdn.cnn.com/cnnnext/dam/assets/190305104212-democrat-voter-panel-new-day-super-tease.jpg",
                "publishedAt": "2019-03-06T20:09:10.514455Z",
                "content": "Chat with us in Facebook Messenger. Find out what's happening in the world as it unfolds."
                }, {
                "source": {
                "id": "cnn",
                "name": "CNN"
                },
                "author": null,
                "title": "Santorum: Trump won't refuse to leave office if he loses - CNN Video",
                "description": "Former Senator Rick Santorum says he does not think President Trump would resist leaving office if he lost the presidential election in 2020.",
                "url": "http://us.cnn.com/videos/politics/2019/03/05/santorum-trump-2020-election-result-response-crn-vpx.cnn",
                "urlToImage": "https://cdn.cnn.com/cnnnext/dam/assets/190305140300-santorum-trump-2020-election-result-resposne-crn-vpx-00000000-super-tease.jpg",
                "publishedAt": "2019-03-06T20:08:57.717614Z",
                "content": "Chat with us in Facebook Messenger. Find out what's happening in the world as it unfolds."
                }, {
                "source": {
                "id": "cnn",
                "name": "CNN"
                },
                "author": "Elizabeth Landers, CNN",
                "title": "Freshman GOP senator reveals she was sexually assaulted when she served in the military",
                "description": "Freshman Sen. Martha McSally of Arizona revealed Wednesday that she was raped while she served in the military.",
                "url": "http://us.cnn.com/2019/03/06/politics/martha-mcsally-rape-sexual-assault-survivor/index.html",
                "urlToImage": "https://cdn.cnn.com/cnnnext/dam/assets/180829001841-04-martha-mcsally-0828-primary-victory-super-tease.jpg",
                "publishedAt": "2019-03-06T19:57:48Z",
                "content": null
                }, {
                "source": {
                "id": "cnn",
                "name": "CNN"
                },
                "author": "Analysis by Chris Cillizza, CNN Editor-at-large",
                "title": "Hillary Clinton is OUT of the 2020 race. (Or is she?)",
                "description": "On Monday, Hillary Clinton ruled out -- once and for all -- running for president for a third time in 2020.",
                "url": "http://us.cnn.com/2019/03/06/politics/hillary-clinton-2020/index.html",
                "urlToImage": "https://cdn.cnn.com/cnnnext/dam/assets/170913115154-hillary-clinton-09-12-2017-super-tease.jpg",
                "publishedAt": "2019-03-06T19:45:25Z",
                "content": "THE POINT -- NOW ON YOUTUBE! \r\nIn each episode of his weekly YouTube show, Chris Cillizza will delve a little deeper into the surreal world of politics. Click to subscribe!"
                }, {
                "source": {
                "id": "cnn",
                "name": "CNN"
                },
                "author": "Lisa Respers France, CNN",
                "title": "What we learned from the R. Kelly interview Part 1",
                "description": "The first portion of Gayle King's exclusive interview with singer R. Kelly aired on \"CBS This Morning\" Wednesday and it was explosive.",
                "url": "http://us.cnn.com/2019/03/06/entertainment/r-kelly-what-we-learned/index.html",
                "urlToImage": "https://cdn.cnn.com/cnnnext/dam/assets/190306114230-01-r-kelly-gayle-king-interview-super-tease.jpg",
                "publishedAt": "2019-03-06T19:36:20Z",
                "content": "WATCH: @GayleKing spoke to Joycelyn Savage and Azriel Clary about living with R. Kelly and their estranged relationship with their families. It made them very emotional.\r\nWe'll bring you more of their interview, tomorrow only on @CBSThisMorning. pic.twitter.c… [+64 chars]"
                }, {
                "source": {
                "id": "cnn",
                "name": "CNN"
                },
                "author": "Brian Stelter, CNN Business",
                "title": "Democrats say they will not hold debates on Fox News",
                "description": "The Democrats will not be debating on Fox News this year.",
                "url": "http://us.cnn.com/2019/03/06/media/fox-news-democratic-debates/index.html",
                "urlToImage": "https://cdn.cnn.com/cnnnext/dam/assets/190306134047-dnc-fox-news-debates-super-tease.jpg",
                "publishedAt": "2019-03-06T19:01:18Z",
                "content": null
                }, {
                "source": {
                "id": "cnn",
                "name": "CNN"
                },
                "author": "Betsy Klein, CNN",
                "title": "What does Ivanka Trump do?",
                "description": "Ivanka Trump became a full-time adviser to the President in March 2017 after informally advising her father, Donald Trump, during the first two months of his administration.",
                "url": "http://us.cnn.com/2019/03/06/politics/ivanka-trump-security-clearance-white-house/index.html",
                "urlToImage": "https://cdn.cnn.com/cnnnext/dam/assets/190213112809-ivanka-trump-wilbur-ross-super-tease.jpg",
                "publishedAt": "2019-03-06T17:37:35Z",
                "content": "Washington (CNN)Ivanka Trump became a full-time adviser to the President in March 2017 after informally advising her father, Donald Trump, during the first two months of his administration. \r\nCritics point out her lack of government experience, but defenders … [+6569 chars]"
                }, {
                "source": {
                "id": "cnn",
                "name": "CNN"
                },
                "author": "Analysis by Chris Cillizza, CNN Editor-at-large",
                "title": "Donald Trump is laying the groundwork to de-legitimize the 2020 election",
                "description": "Even as the 2020 race begins in earnest, President Donald Trump is already suggesting that Democrats cannot beat him fairly -- raising the specter that if he loses next November, he will suggest that the election was not legitimate.",
                "url": "http://us.cnn.com/2019/03/06/politics/donald-trump-2020-election-illegitimate/index.html",
                "urlToImage": "https://cdn.cnn.com/cnnnext/dam/assets/190306094939-trump-03052019-super-tease.jpg",
                "publishedAt": "2019-03-06T17:05:53Z",
                "content": "THE POINT -- NOW ON YOUTUBE! \r\nIn each episode of his weekly YouTube show, Chris Cillizza will delve a little deeper into the surreal world of politics. Click to subscribe!"
                }, {
                "source": {
                "id": "cnn",
                "name": "CNN"
                },
                "author": "Clare Foran, CNN",
                "title": "Democratic lawmaker announces plans to file impeachment resolution",
                "description": "Democratic Rep. Rashida Tlaib plans to file soon an impeachment resolution against President Donald Trump, the freshmen Democratic lawmaker from Michigan announced at a news conference Wednesday.",
                "url": "http://us.cnn.com/2019/03/06/politics/rashida-tlaib-impeachment-resolution/index.html",
                "urlToImage": "https://cdn.cnn.com/cnnnext/dam/assets/190227165707-27-michael-cohen-house-hearing-0227-super-tease.jpg",
                "publishedAt": "2019-03-06T16:49:06Z",
                "content": "(CNN)Democratic Rep. Rashida Tlaib plans to file soon an impeachment resolution against President Donald Trump, the freshmen Democratic lawmaker from Michigan announced at a news conference Wednesday.\r\n\"Later on this month, I will be joining folks and advocat… [+4054 chars]"
                }, {
                "source": {
                "id": "cnn",
                "name": "CNN"
                },
                "author": "Analysis by Harry Enten, CNN",
                "title": "Early polling suggests 2020 will be about Trump. That's bad news for him.",
                "description": "President Donald Trump was able to win the White House in 2016 despite being the least liked major party nominee in history. Today, more people continue to dislike than like Trump.",
                "url": "http://us.cnn.com/2019/03/05/politics/2020-bad-news-trump/index.html",
                "urlToImage": "https://cdn.cnn.com/cnnnext/dam/assets/190305012913-0305-trump-photo-01-super-tease.jpg",
                "publishedAt": "2019-03-06T11:50:39Z",
                "content": null
                }]


*/
