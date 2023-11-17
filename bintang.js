const nama = prompt("Masukkan Nama");
const nim = prompt("Masukkan Nim");

var ok = confirm("Apakah Anda ingin menampilkan pola bintang?");
if (ok) {
    var b = "";
    for (var a = 5; a > 0; a--) {
        for (var i = a; i > 0; i--) {
            b += "*";
        }
        b += "\n";
    }
    alert(b);
}

document.writeln("Nama : " + nama);
document.write("<br/>");
document.writeln("Nim  : " + nim);
document.write("<br/>");

const iterasi = prompt("Ingin mencoba lagi?");
document.write("<br/>");

for (var c = 1; c < 9; c++) {
    for (var j = 1; j <= c; j++) {
        document.write("*");
    }
    document.write("<br>");
}
