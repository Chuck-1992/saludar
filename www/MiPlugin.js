var exec = require('cordova/exec');

exports.saludar = function (arg0, success, error) {
    exec(success, error, 'MiPlugin', 'coolMethod', [arg0]);
};
