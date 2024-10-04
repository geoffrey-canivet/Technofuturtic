function createScoreBoard() {
    const scoreBoard = {
     'The Best Ever': 1000000
   }
   return scoreBoard
 }
 const scoreBoard = createScoreBoard(); 
 console.log(scoreBoard);  

function addPlayer(scoreBoard, player, score) {
    scoreBoard[player] = score
    return scoreBoard
}

function removePlayer(scoreBoard, player) {
    delete scoreBoard[player]
    return scoreBoard
}


function updateScore(scoreBoard, player, points) {
    scoreBoard[player] += points
    return scoreBoard
}

function applyMondayBonus(scoreBoard) {
    
    for (let joueur in scoreBoard) {
        scoreBoard[joueur] += 100
        
    }
    return scoreBoard
}

function normalizeScore(params) {

    return params.normalizeFunction(params.score);
}
