/**
 * @param {string} num1
 * @param {string} num2
 * @return {string}
 */
var addStrings = function(num1, num2) {
    var n1 = num1.length -1;
    var n2 = num2.length -1;

    let sum=[];
    let carry = 0;

    while(n1>=0||n2>=0||carry){

        var a = n1>=0?parseInt(num1[n1]):0
        var b = n2>=0?parseInt(num2[n2]):0
       
        var c = a+b+carry;

        carry = Math.floor(c/10);
        sum.push(c%10)

        n1--;
        n2--;
       
    }
  return sum.reverse().join('');  
};