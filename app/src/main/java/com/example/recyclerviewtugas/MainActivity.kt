package com.example.recyclerviewtugas

import android.content.Intent
import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.recyclerview.widget.GridLayoutManager
import com.example.recyclerviewtugas.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity(), MovieClickListener {
    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        populateMovies()

        val mainActivity = this
        binding.recyclerView.apply {
            layoutManager = GridLayoutManager(applicationContext, 3)
            adapter = CardAdapter(movieList,mainActivity)
        }
    }
    override fun onClick(movie: Movie) {
        val intent = Intent(applicationContext, DetailActivity::class.java)
        intent.putExtra(MOVIE_ID_EXTRA, movie.id)
        startActivity(intent)
    }

    private fun populateMovies()
    {
        val movie1 = Movie(
            R.drawable.bladerunner2049,
            "Denis Villeneuve",
            "BLADERUNNER 2049",
            "Sekuel dari film klasik Blade Runner, mengikuti kisah K, seorang blade runner dan replikant yang mencari kebenaran tentang masa lalu dan keberadaan manusia. Penyelidikannya mengarah pada penemuan yang dapat mengubah masyarakat selamanya, mempertemukan K dengan Rick Deckard, yang hilang selama tiga dekade."
        )
        movieList.add(movie1)

        val movie2 = Movie(
            R.drawable.spiderman,
            "Bob Persichetti, Peter Ramsey, dan Rodney Rothman",
            "SPIDERMAN INTO THE SPIDER-VERSE",
            "Mengisahkan Miles Morales, seorang remaja yang mendapat kekuatan mirip Spider-Man. Ketika dimensi lain terbuka, ia bertemu dengan berbagai versi Spider-Man dari multiverse. Bersama-sama, mereka berjuang melawan ancaman yang bisa menghancurkan semua dimensi."
        )
        movieList.add(movie2)

        val movie3 = Movie(
            R.drawable.interstellar,
            "Christopher Nolan",
            "INTERSTELLAR",
            "Dalam upaya menyelamatkan umat manusia yang terancam oleh keruntuhan lingkungan, sekelompok astronot melakukan perjalanan melintasi wormhole di dekat Saturnus untuk menemukan planet baru yang layak huni. Film ini mengeksplorasi tema cinta, pengorbanan, dan waktu."
        )
        movieList.add(movie3)

        val movie4 = Movie(
            R.drawable.joker,
            "Todd Phillips",
            "JOKER",
            "Menceritakan kisah Arthur Fleck, seorang komedian gagal yang terjebak dalam kehidupan yang menyakitkan dan penuh kekerasan di Gotham City. Perjalanannya menuju transformasi menjadi Joker, penjahat ikonik, menggambarkan dampak dari keterasingan dan stigma mental."
        )
        movieList.add(movie4)

        val movie5 = Movie(
            R.drawable.kiminonawa,
            "Makoto Shinkai",
            "KIMI NO NAWA",
            "Mengisahkan dua remaja, Taki dan Mitsuha, yang secara misterius bertukar tubuh. Mereka mencoba berkomunikasi dan memahami satu sama lain meski terpisah oleh waktu dan ruang. Cerita ini mengeksplorasi tema cinta, kehilangan, dan takdir."
        )
        movieList.add(movie5)

        val movie6 = Movie(
            R.drawable.pacificrim,
            "Guillermo del Toro",
            "PACIFIC RIM",
            "Dalam upaya melawan monster raksasa yang muncul dari laut, manusia mengembangkan robot raksasa yang disebut Jaeger. Dua pilot yang tidak terduga harus bekerja sama untuk mengendalikan robot dan menyelamatkan umat manusia dari ancaman yang menghancurkan."
        )
        movieList.add(movie6)

        val movie7 = Movie(
            R.drawable.shingodzilla,
            "Hideaki Anno dan Shinji Higuchi",
            "SHIN GODZILLA",
            "Sebuah reinterpretasi dari monster klasik Godzilla, film ini menggambarkan serangan Godzilla yang menghancurkan Tokyo dan reaksi pemerintah dalam menghadapi krisis. Dengan pendekatan yang lebih serius dan realistis, film ini mengeksplorasi tema birokrasi dan respons terhadap bencana."
        )
        movieList.add(movie7)


    }


}
