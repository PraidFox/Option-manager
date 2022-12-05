const path = require('path')
const HtmlWebpackPlugin = require('html-webpack-plugin')
module.exports = {
    entry: "./src/index.js",
    output: {
        //path: path.join(__dirname, "~/tutorial/src/main/resources/js"),
        path: path.join(__dirname, "../src/main/resources/js"),
        filename: "main-view.js"
    },
    module: {
        rules: [
            {
                test: /\.(js|jsx)$/,
                exclude: /node_modules/,
                use: {
                    loader: "babel-loader"
                }
            }
        ]
    },
    plugins: [
        new HtmlWebpackPlugin({
            template: './src/index.html'
        })
    ]
}