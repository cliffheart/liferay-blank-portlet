// ttdat
// Document
// https://primefaces.github.io/primefaces/8_0/#/ajax/javascriptApi
// https://primefaces.github.io/primefaces/8_0/#/core/javascriptAPI
$(document).on('pfAjaxStart', function() {
	//Notiflix.Loading.Dots();
});

$(document).on('pfAjaxSend', function(xhr, settings) {
    //console.log('Send');
});

$(document).on('pfAjaxError', function(xhr, settings, error) {
    //console.log('Error');
});

$(document).on('pfAjaxSuccess', function(xhr, settings) {
    //console.log('Success');
});

$(document).on('pfAjaxComplete', function(xhr, settings) {
	//Notiflix.Loading.Remove();
});
