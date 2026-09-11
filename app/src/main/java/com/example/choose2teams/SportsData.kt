package com.example.choose2teams

data class League(
    val name: String,
    val teams: List<String>
)

object SportsData {
    val leagues = listOf(
        League(
            name = "NBA",
            teams = listOf(
                "Atlanta Hawks", "Boston Celtics", "Brooklyn Nets", "Charlotte Hornets",
                "Chicago Bulls", "Cleveland Cavaliers", "Dallas Mavericks", "Denver Nuggets",
                "Detroit Pistons", "Golden State Warriors", "Houston Rockets", "Indiana Pacers",
                "LA Clippers", "Los Angeles Lakers", "Memphis Grizzlies", "Miami Heat",
                "Milwaukee Bucks", "Minnesota Timberwolves", "New Orleans Pelicans", "New York Knicks",
                "Oklahoma City Thunder", "Orlando Magic", "Philadelphia 76ers", "Phoenix Suns",
                "Portland Trail Blazers", "Sacramento Kings", "San Antonio Spurs", "Toronto Raptors",
                "Utah Jazz", "Washington Wizards"
            )
        ),
        League(
            name = "MLB",
            teams = listOf(
                "Arizona Diamondbacks", "Atlanta Braves", "Baltimore Orioles", "Boston Red Sox",
                "Chicago White Sox", "Chicago Cubs", "Cincinnati Reds", "Cleveland Guardians",
                "Colorado Rockies", "Detroit Tigers", "Houston Astros", "Kansas City Royals",
                "Los Angeles Angels", "Los Angeles Dodgers", "Miami Marlins", "Milwaukee Brewers",
                "Minnesota Twins", "New York Yankees", "New York Mets", "Oakland Athletics",
                "Philadelphia Phillies", "Pittsburgh Pirates", "San Diego Padres", "San Francisco Giants",
                "Seattle Mariners", "St. Louis Cardinals", "Tampa Bay Rays", "Texas Rangers",
                "Toronto Blue Jays", "Washington Nationals"
            )
        ),
        League(
            name = "WNBA",
            teams = listOf(
                "Atlanta Dream", "Chicago Sky", "Connecticut Sun", "Dallas Wings",
                "Indiana Fever", "Las Vegas Aces", "Los Angeles Sparks", "Minnesota Lynx",
                "New York Liberty", "Phoenix Mercury", "Seattle Storm", "Washington Mystics"
            )
        ),
        League(
            name = "MiLB AAA",
            teams = listOf(
                "Buffalo Bisons", "Charlotte Knights", "Columbus Clippers", "Durham Bulls",
                "Gwinnett Stripers", "Indianapolis Indians", "Iowa Cubs", "Jacksonville Jumbo Shrimp",
                "Lehigh Valley IronPigs", "Louisville Bats", "Memphis Redbirds", "Nashville Sounds",
                "Norfolk Tides", "Omaha Storm Chasers", "Rochester Red Wings", "Scranton/Wilkes-Barre RailRiders",
                "St. Paul Saints", "Syracuse Mets", "Toledo Mud Hens", "Worcester Red Sox"
            )
        ),
        League(
            name = "MiLB AA",
            teams = listOf(
                "Akron RubberDucks", "Altoona Curve", "Arkansas Travelers", "Binghamton Rumble Ponies",
                "Birmingham Barons", "Bowie Baysox", "Chattanooga Lookouts", "Corpus Christi Hooks",
                "Erie SeaWolves", "Frisco RoughRiders", "Harrisburg Senators", "Hartford Yard Goats",
                "Midland RockHounds", "Mississippi Braves", "New Hampshire Fisher Cats", "Northwest Arkansas Naturals",
                "Pensacola Blue Wahoos", "Portland Sea Dogs", "Reading Fightin Phils", "Richmond Flying Squirrels",
                "Rocket City Trash Pandas", "San Antonio Missions", "Somerset Patriots", "Springfield Cardinals",
                "Tennessee Smokies", "Tulsa Drillers", "Wichita Wind Surge"
            )
        ),
        League(
            name = "MiLB A",
            teams = listOf(
                "Aberdeen IronBirds", "Asheville Tourists", "Beloit Sky Carp", "Bowling Green Hot Rods",
                "Brooklyn Cyclones", "Cedar Rapids Kernels", "Dayton Dragons", "Eugene Emeralds",
                "Everett AquaSox", "Fort Wayne TinCaps", "Great Lakes Loons", "Greensboro Grasshoppers",
                "Greenville Drive", "Hickory Crawdads", "Hudson Valley Renegades", "Jersey Shore BlueClaws",
                "Lake County Captains", "Lansing Lugnuts", "Peoria Chiefs", "Quad Cities River Bandits",
                "Rome Emperors", "South Bend Cubs", "Spokane Indians", "Tri-City Dust Devils",
                "Vancouver Canadians", "West Michigan Whitecaps", "Wilmington Blue Rocks", "Winston-Salem Dash"
            )
        ),
        League(
            name = "GBL (Greek Basketball League)",
            teams = listOf(
                "AEK", "Aris", "Karditsas", "Kolossos", "Lavrio",
                "Maroussi", "Olympiacos", "Panathinaikos", "Panionios",
                "PAOK", "Peristeri", "Promitheas"
            )
        )
    )
}
