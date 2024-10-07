const isPaired = (chaine) => {
    const stack = []; 


    for (const element of chaine) {

        if (element === '(' || element === '{' || element === '[') {
            stack.push(element);
        } 

        else if (element === ')' || element === '}' || element === ']') {
            const last = stack.pop(); 

            if (
                (element === ')' && last !== '(') ||
                (element === '}' && last !== '{') ||
                (element === ']' && last !== '[')
            ) {
                return false; 
            }
        }
    }

    return stack.length === 0;
};
