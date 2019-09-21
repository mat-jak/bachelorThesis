import HTTP from '@/services/http/http-common';

export default {
    create(classification) {
        return HTTP.post(`/classifications`, classification)
    },

    assignDocstring(id, docstring) {
        return HTTP.put(`/classifications/${id}/docstrings/assign`, docstring)
    },

    assignUser(id, user) {
        return HTTP.put(`/classifications/${id}/users/assign`, user)
    },

    update(id, classification) {
        return HTTP.put(`/classifications/${id}`, classification)
    }
}
