let longitud = 10;

function crearArray(n) {
    if (n <= 0) {
        return [];
    }
    let numeros = [];
    for (let i = 0; i < n; i++) {
        numeros[i] = i+1;
    }
    return numeros;
}
let resultado = crearArray(longitud);
console.log(resultado);