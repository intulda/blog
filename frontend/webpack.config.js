const path = require('path');
const process = require('process');
const HtmlWebpackPlugin = require('html-webpack-plugin');
const {CleanWebpackPlugin} = require('clean-webpack-plugin');


module.exports = {
    mode : 'development',
    entry : {
        bundle : './src/index.js'
    },

    output : {
        path : path.resolve(__dirname, './dist'),
        filename : '[name].js',
    },
    devServer: {
        overlay: true,
        stats: "errors-only",
        // TODO: 여기에 핫로딩 true
        hot : true,
        proxy: {
            '/posts': 'http://localhost:4500',
        },
    },
    module: {
      rules: [
          {
              test: /\.js$/,
              loader: "babel-loader",
              exclude: /node_modules/,
          }
      ]
    },
    plugins : [
        new HtmlWebpackPlugin({
            template : './index.html',
            templateParameters : {
                env: process.env.NODE_DEV === 'development' ? '개발' : ''
            },
            minify :process.env.NODE_ENV === 'production' ? {
                collapseWhitespace : true, //공백제거
                removeComments : true //주석제거
            } : false
        }),
        new CleanWebpackPlugin()
    ]
}