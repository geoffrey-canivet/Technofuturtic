const gigasecond = () => {
    const gs = 1000000000
    
};


const gs = gigasecond(new Date(Date.UTC(2011, 3, 25)));
const expectedDate = new Date(Date.parse('2043-01-01T01:46:40Z'));

console.log(gs)
console.log(expectedDate)