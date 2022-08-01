const {createProxyMiddleware} = require('http-proxy-middleware');

module.exports = (app) => {
    app.use(
        createProxyMiddleware(
            '/api',
            {
                target: 'http://localhost:8080',
                changeOrigin: true,
            }),
    );
    app.use(
        createProxyMiddleware(
            '/auth',
            {
                target: 'http://localhost:8080',
                changeOrigin: true,
            }),
    );
};
/*
module.exports = function (app) {
    app.use('/api',
        createProxyMiddleware({
            target: 'http://localhost:8080',
            changeOrigin: true,
        })
    );
};*/
