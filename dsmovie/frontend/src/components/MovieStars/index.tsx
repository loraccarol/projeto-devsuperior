import {ReactComponent as StarFull} from '../../assets/img/star-full.svg'
import {ReactComponent as StarHalf} from '../../assets/img/half-star.svg'
import {ReactComponent as StarEmpty} from '../../assets/img/empty-star.svg'
import './style.css'

function MovieStars() {
    return (
        <div className="dsmovie-stars-container">
            <StarFull />
            <StarFull />
            <StarFull />
            <StarHalf />
            <StarEmpty />
        </div>
    )
}

export default MovieStars;