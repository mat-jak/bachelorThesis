import HTTP from '@/services/http/http-common';

export default {
    sample() {
        return HTTP.get('/docstrings/sample')
    },

    moreDocstrings(userId) {
        return HTTP.get(`/docstrings/${userId}/sample`)
    }
}