package com.example.worldcup.util

import com.example.worldcup.Data.Domain.Match

class CsvParse {

    fun parse(line:String): Match {
        val token =line.split(",")

        return Match(
            year = token[Constant.index.year].toInt(),
            stadium = token[Constant.index.stadium],
            city = token[Constant.index.city],
            homeTeamName = token[Constant.index.homeTeamName],
            awyTeamName = token[Constant.index.awyTeamName],
            homeTeamGoals = token[Constant.index.homeTeamGoals].toInt(),
            awyTeamGoals = token[Constant.index.awyTeamGoals].toInt()
        )

    }
}