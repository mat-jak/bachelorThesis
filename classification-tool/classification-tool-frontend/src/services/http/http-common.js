import axios from 'axios';


const axiosInstance = axios.create({
    baseURL: 'https://docstring-classificator.herokuapp.com/api/v1',
})

export default axiosInstance;