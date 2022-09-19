# Smart Fridge

Si implementi un sistema di gestione che rappresenti un frigorifero capace di registrare la data di scadenza dei cibi inseriti tramite scansione e monitorarne lo stato di conservazione.

Deve implementare l'interfaccia IFridge, con le seguenti funzionalità

- **setCurrentDate**: imposta la data corrente per il frigo
- **openFridge**: apre il frigo
- **closeFridge**: chiude il frigo
- **scanAddedItem**: inserisce un prodotto indicando le sue proprietà
- **scanRemoveItem**: rimuove un prodotto identificandolo per nome
- **simulateDayOver**: simula l'avanzamento di 24 ore
- **showDisplay**: stampa console l'elenco dei prodotti presenti

### Vincoli

- Ogni volta che si apre il frigo i prodotti **già** dentro di esso riducono la propria data di scadenza: per i prodotti aperti diminuisce di 5 ore, per quelli ancora sigillati di 1
- Il sistema deve dare errore se si cerca di inserire o rimuovere un prodotto senza aprire il frigo
- Se si rimuove un prodotto scaduto, il sistema deve stampare a console un avviso del tipo: "Attenzione: il prodotto {NOME} è scaduto da {numero di giorni} giorni."
- Non c'è un limite di capacità del frigo
- Due prodotti possono avere lo stesso nome: nel caso si voglia rimuoverne uno ne va tolto uno a caso
- Il display elenca i prodotti per ordine di data di scadenza decrescente, aggiungendo "SCADUTO: " se la data di scadenza è stata raggiunta o oltrepassata
- Il display stampa nome, data di scadenza corrente e stato del prodotto.
- Se si cerca di aprire un frigo già aperto o chiuderne uno già chiuso, non succede nulla.

### Obiettivi

- Implementare l'interfaccia IFridge secondo le specifiche
- Scrivere la classe di test dell'implementazione

### Tempo 

- 2h