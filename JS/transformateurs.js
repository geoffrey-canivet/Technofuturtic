function sandwichTrick(deck) {
    let card1 = deck[0];
    let card2 = deck[deck.length - 1];
    deck.splice(deck.length / 2, 0, card2, card1)
    deck.splice(0,1)
    deck.splice(deck.length - 1,1)
    return deck


}


function twoIsSpecial(deck) {
    return deck.filter(card => card === 2);
}


function perfectlyOrdered(deck) {
    return deck.sort((a, b) => a - b)
}


function reorder(deck) {
    return deck.reverse()
}