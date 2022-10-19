const arr = [1, 2, 3, 4, 5];
function maxNum(arr) {
    if (arr.length === 0) {
        return -1;
    }
    let maxVal = arr[0];
    for (const i of arr) {
        if (i > maxVal) {
            maxVal = i;
        }
    }
    return maxVal;
}
console.log(maxNum(arr));
function max(arr) {
    return Math.max(...arr);
}
console.log(max([1, 2, 3, 4, 5]));