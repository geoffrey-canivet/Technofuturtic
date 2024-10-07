const truncate = (input) => {
    return input.split('').slice(0, 4).join("");
};

truncate('Hello there')
// => abcd