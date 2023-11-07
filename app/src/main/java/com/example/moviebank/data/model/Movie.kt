package com.example.moviebank.data.model

class Movie(
    val id : Int = 0,
    val originalTitle : String,
    val adult : Boolean,
    val genreIds : List<Int>,
    val originalLanguage : String,
    val overview : String, //description in movie_item
    val posterPath : String,
    val releaseDate : String, //yyyy-mm-dd
    val title : String,
    val voteAverage : Double, // rating
    val voteCount : Int ) {
}


/*"page": 1,
  "results": [
    {
      "adult": false,
      "backdrop_path": "/frDS8A5vIP927KYAxTVVKRIbqZw.jpg",
      "genre_ids": [
        14,
        28,
        80
      ],
      "id": 268,
      "original_language": "en",
      "original_title": "Batman",
      "overview": "Gotham City erstickt in einem Sumpf aus Korruption und Verbrechen, und nur ein Mann stellt sich der Gefahr: Batman, der dunkle Ritter in dem Fledermaus-Cape. Die Reporterin Vicky Vale wittert eine heiße Story, und will die Identität des mysteriösen Kämpfers für das Gute aufdecken. Doch Batman hat andere Probleme: Er ist Joker auf den Fersen, der die Macht in Gothams Unterwelt an sich reißen will ...",
      "popularity": 51.611,
      "poster_path": "/cij4dd21v2Rk2YtUQbV5kW69WB2.jpg",
      "release_date": "1989-06-21",
      "title": "Batman",
      "video": false,
      "vote_average": 7.218,
      "vote_count": 7203
    }, */