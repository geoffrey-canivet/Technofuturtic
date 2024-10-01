function twoSum(array1, array2) {
    return Number(array1.join("")) + Number(array2.join(""))
}

  twoSum([1, 2, 3], [0, 7]);


function luckyNumber(value) {
    if (String(value).split("").reverse().join('') === String(value)) {
        return true
    } else {
        return false
    }
}

luckyNumber(1441);
//=>  true

luckyNumber(123);
//=> false


function errorMessage(input) {

    if (input === "") {
        return "Required field"
    } else if (isNaN(Number(input)) || Number(input) <= 0) {
        return 'Must be a number besides 0'
    } else {
        return ''
    }
}

errorMessage('123');
// => ''

errorMessage('');
// => 'Required field'

errorMessage('abc');
// => 'Must be a number besides 0'