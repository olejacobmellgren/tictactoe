# TicTacToe - Eget prosjekt

TicTacToe er et spill som jeg her har implementert i Java ved hjelp av JavaFX. Prosjektet er laget av eget initiativ og er ikke et prosjekt i forbindelse med min utdanning på NTNU.

## Bygging og kjøring med maven

Prosjektet er konfigurert til å bygge med maven. Ved å kjøre `mvn install` i **tictactoeGame** vil man forberede prosjektet for å kunne kjøre. Man kan kjøre applikasjonen ved å navigere til **tictactoeGame/ui** og kjøre `mvn javafx:run`, eller kjøre `mvn javafx:run -f ui/pom.xml` direkte i **tictactoeGame**.

## Testing

Prosjektet har foreløpig ingen tester men vil kunne kjøres ved `mvn test` i **tictactoeGame**.