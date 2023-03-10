// api url
const api_url = "http://localhost:8080/api/chitiethoadon/9";

// Defining async function
async function getapi(url) {
	
	// Storing response
	const response = await fetch(url);
	
	// Storing data in form of JSON
	var data = await response.json();
	console.log(data);
    console.log(data.length);
    console.log(Object.keys(data).length);

	if (response) {
		hideloader();
	}
	show(data);
}
// Calling that async function
getapi(api_url);

// Function to hide the loader
function hideloader() {
	document.getElementById('loading').style.display = 'none';
}
// Function to define innerHTML for HTML table
function show(data) {
	let tab = `<tr>
		            <th>MA SAN PHAM</th>
		            <th>GIA</th>
		            <th>SO LUONG</th>
		        </tr>`;
	
	// Loop to access all rows
	for (let r = 0; r < Object.keys(data).length; r++) {
		tab += `<tr>
                    <td>${data[r].maSanPham} </td>
                    <td>${data[r].gia}</td>
                    <td>${data[r].soLuong}</td>
                </tr>`;
	}
	// Setting innerHTML as tab variable
	document.getElementById("employees").innerHTML = tab;
}
