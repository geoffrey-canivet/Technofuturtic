let reverseChaine = [];
let chaine = "ma formation javascript";

console.log(chaine.indexOf("fo"))
console.log(chaine.indexOf("p"))
console.log(chaine.charAt(22))
console.log(chaine.replace("javascript", 'Java'))
console.log(chaine.split(""))

for (let i = chaine.length - 1; i > -1; i--) {
    reverseChaine.push(chaine[i]);
}
console.log(reverseChaine.join(""));