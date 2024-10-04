let music = []

const convert = (num) => {
    let music = []
    if (num % 3 === 0) {
        music.push("Pling")
    }
    if (num % 5 === 0) {
        music.push("Plang")
    }
    if (num % 7 === 0) {
        music.push("Plong")
    } 
    if (num % 3 !== 0 && num % 5 !== 0 && num % 7 !== 0) {
      music.push(String(num))
    }
    return music.join("")
};


convert(105)