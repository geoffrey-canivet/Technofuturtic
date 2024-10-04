const findAnagrams = (word, tabWord) => {
    let res = []
    tabWord.forEach(el => {
        if (el.toLowerCase() !== word.toLowerCase()) {
            let tab1 = el.toLowerCase().split("").sort().join("")
            let tab2 = word.toLowerCase().split("").sort().join("")
            if(tab1 == tab2)
                res.push(el)
        } 
        
    });
    return res
};



findAnagrams('LISTEN', ['Listen', 'Silent', 'LISTEN'])