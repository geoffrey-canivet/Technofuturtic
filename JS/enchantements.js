function getFirstCard(deck) {

    const [a] = deck
    return a
}


function getSecondCard(deck) {
    const [ , a] = deck
    return a
}



function swapTopTwoCards(deck) {
    [deck[1], deck[0]] = [deck[0], deck[1]];
    return deck
}




function discardTopCard(deck) {
    const [a, ...everythingElse] = deck;
    deck.length = 0;
    deck.push(a)
    deck.push(everythingElse)
    return deck
}



// const deck = [2, 5, 4, 9, 3];

// discardTopCard(deck);
// => [2, [5, 4, 9, 3]]

const FACE_CARDS = ['jack', 'queen', 'king'];
const deck = [5, 4, 7, 10];

function insertFaceCards(deck) {
    const [first, ...end] = deck
    deck.length = 0
    deck.push(first)
    for (let item in FACE_CARDS){
        deck.push(FACE_CARDS[item])
    }
    for (let item in end){
        deck.push(end[item])
    }
    return deck
}



// BEST PRATICE
// function insertFaceCards(deck) {
//     const [first, ...end] = deck;
//     return [first, ...FACE_CARDS, ...end];
// }


insertFaceCards(deck);
// => [5, 'jack', 'queen', 'king', 4, 7, 10]

