package com.panjidwisatrio.noyu.data

import com.panjidwisatrio.noyu.R
import com.panjidwisatrio.noyu.model.Movie

object MovieData {
    private val movieTitle = arrayOf(
        "Supernatural",
        "The Dark Knight",
        "The Office",
        "The Expanse",
        "Joker",
        "The Boys",
        "Lampor: Keranda Terbang",
        "Spider-Man : No Way Home",
        "Fight Club",
        "The Godfather"
    )
    private val movieUsia = arrayOf(
        "16+",
        "R",
        "SU",
        "16+",
        "17+",
        "A",
        "13+",
        "SU",
        "21",
        "18+",
    )
    private val movieGenre = arrayOf(
        "Drama, fantasy, Horror, Mystery, Thriller",
        "Action, Crime, Drama",
        "Action, Adventure, Fantasy",
        "Drama, Mystery, Sci-Fi",
        "Crime, Drama, Thriller",
        "Action, Crime, Drama",
        "Horror",
        "Action, Adventure, Fantasy",
        "Drama",
        "Crime, Drama",
    )
    private val movieRating = arrayOf(
        "8.6/10",
        "9.1/10",
        "7.5/10",
        "8.6/10",
        "8.4/10",
        "8.7/10",
        "5.4/10",
        "8.7/10",
        "8.8/10",
        "9.0/10",
    )
    private val movieSinopsis = arrayOf(
        "Two brothers follow their father's footsteps as hunters, fighting evil supernatural beings of many kinds, including monsters, demons and gods that roam the earth.",
        "When the menace known as the Joker wreaks havoc and chaos on the people of Gotham, Batman must accept one of the greatest psychological and physical tests of his ability to fight injustice.",
        "Shang-Chi, the master of weaponry-based Kung Fu, is forced to confront his past after being drawn into the Ten Rings organization.",
        "In the 24th century, a group of humans untangle a vast plot which threatens the Solar System's fragile state of detente",
        "In Gotham City, mentally troubled comedian Arthur Fleck is disregarded and mistreated by society. He then embarks on a downward spiral of revolution and bloody crime. This path brings him face-to-face with his alter-ego: the Joker.",
        "A group of vigilantes set out to take down corrupt superheroes who abuse their superpowers.",
        "Edwin and Netta with their two children, Adam and Sekar going to Netta's hometown at Temanggung. Netta were suspected as the cause of Lampor terror at her hometown, a demon who bring a flying casket.",
        "With Spider-Man's identity now revealed, Peter asks Doctor Strange for help. When a spell goes wrong, dangerous foes from other worlds start to appear, forcing Peter to discover what it truly means to be Spider-Man.",
        "An insomniac office worker and a devil-may-care soap maker form an underground fight club that evolves into much more.",
        "The early life and career of Vito Corleone in 1920s New York City is portrayed, while his son, Michael, expands and tightens his grip on the family crime syndicate.",
    )
    private val movieThumbnail = intArrayOf(
        R.drawable.supernatural,
        R.drawable.thedarkknight,
        R.drawable.theoffice,
        R.drawable.theexpanse,
        R.drawable.joker,
        R.drawable.theboys,
        R.drawable.lampor,
        R.drawable.spiderman,
        R.drawable.fightclub,
        R.drawable.thegodfather,
    )
    private val movieAktor = intArrayOf(
        R.drawable.jared_padalecki,
        R.drawable.christian_bale,
        R.drawable.simu_liu,
        R.drawable.steven_strait,
        R.drawable.joaquin_phoenix,
        R.drawable.karl_urban,
        R.drawable.adinia_wirasti,
        R.drawable.tom_holland,
        R.drawable.brad_pitt,
        R.drawable.al_pacino
    )
    private val aktorName = arrayOf(
        "Jared Padalecki",
        "Christian Bale",
        "Simu Liu",
        "Steven Strait",
        "Joaquin Phoenix",
        "Karl Urban",
        "Adinia Wirasti",
        "Tom Holland",
        "Brad Pitt",
        "Al Pacino",
    )
    private val movieReference = arrayOf(
        "https://www.imdb.com/title/tt0460681/?ref_=hm_stp_pvs_piv_tt_t_7",
        "https://www.imdb.com/title/tt0468569/?ref_=nv_sr_srsg_0",
        "https://www.imdb.com/title/tt9376612/?ref_=nv_sr_srsg_0",
        "https://www.imdb.com/title/tt3230854/?ref_=hm_stp_pvs_piv_tt_t_12",
        "https://www.imdb.com/title/tt7286456/?ref_=nv_sr_srsg_0",
        "https://www.imdb.com/title/tt1190634/?ref_=nv_sr_srsg_0",
        "imdb.com/title/tt10698426/?ref_=nv_sr_srsg_0",
        "https://www.imdb.com/title/tt10872600/?ref_=nv_sr_srsg_0",
        "https://www.imdb.com/title/tt0137523/?ref_=ttmi_tt",
        "https://www.imdb.com/title/tt0071562/?ref_=hm_inth_tt_t_18",
    )
    private val movieTahun = arrayOf(
        "December 15, 2016",
        "July 18, 2008",
        "September 3, 2021",
        "February 8, 2019",
        "October 2, 2019",
        "July 26, 2019",
        "October 31, 2019",
        "December 19, 2021",
        "October 15, 1999",
        "January 7, 2016",
    )
    private val movieNegara = arrayOf(
        "United States",
        "United States",
        "United States",
        "United States",
        "United States",
        "United States",
        "Indonesia",
        "United States",
        "United States",
        "United States",
    )

    val listData : ArrayList<Movie>
        get() {
            val list = arrayListOf<Movie>()
            for (position in movieTitle.indices) {
                val movie = Movie()
                movie.title = movieTitle[position]
                movie.name = aktorName[position]
                movie.usia = movieUsia[position]
                movie.reference = movieReference[position]
                movie.genre = movieGenre[position]
                movie.rating = movieRating[position]
                movie.sinopsis = movieSinopsis[position]
                movie.tahun = movieTahun[position]
                movie.negara = movieNegara[position]
                movie.aktor = movieAktor[position]
                movie.thumbnail = movieThumbnail[position]
                list.add(movie)
            }
            return list
        }
}