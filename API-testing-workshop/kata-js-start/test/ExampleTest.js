const chai = require('chai');
const expect = require('chai').expect;
const chaiHttp = require('chai-http');
chai.use(chaiHttp);

process.env.NODE_TLS_REJECT_UNAUTHORIZED = '0';

describe('Example test',  () =>{

    it('should pass', function () {
        expect(true).to.equal(true);
    });

    it('should fail', function () {
        expect(true).to.equal(false);
    });

})